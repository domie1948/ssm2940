package com.controller;


import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

import com.entity.CaiwuEntity;
import com.entity.FuyijiluEntity;
import com.service.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.utils.StringUtil;
import java.lang.reflect.InvocationTargetException;

import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ProposalEntity;

import com.entity.view.ProposalView;
import com.entity.YonghuEntity;

import com.utils.PageUtils;
import com.utils.R;

/**
 * 提案
 * 后端接口
 * @author
 * @email
 * @date 2021-04-13
*/
@RestController
@Controller
@RequestMapping("/proposal")
public class ProposalController {
    private static final Logger logger = LoggerFactory.getLogger(ProposalController.class);

    @Autowired
    private ProposalService proposalService;

    @Autowired
    private FuyijiluService fuyijiluService;

    @Autowired
    private CaiwuService caiwuService;

    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;



    //级联表service
    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        params.put("orderBy","id");
        PageUtils page = proposalService.queryPage(params);

        //字典表数据转换
        List<ProposalView> list =(List<ProposalView>)page.getList();
        for(ProposalView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ProposalEntity proposal = proposalService.selectById(id);
        if(proposal !=null){
            //entity转view
            ProposalView view = new ProposalView();
            BeanUtils.copyProperties( proposal , view );//把实体数据重构到view中

            //级联表
            YonghuEntity yonghu = yonghuService.selectById(proposal.getYonghuId());
            if(yonghu != null){
                BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ProposalEntity proposal, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,proposal:{}",this.getClass().getName(),proposal.toString());
        Wrapper<ProposalEntity> queryWrapper = new EntityWrapper<ProposalEntity>()
            .eq("proposal_name", proposal.getProposalName())
            .eq("zirushouhcu_types", proposal.getZirushouhcuTypes())
            .eq("proposal_types", proposal.getProposalTypes())
            .eq("yonghu_id", proposal.getYonghuId())
            .eq("shifou_types", proposal.getShifouTypes())
            .eq("proposal_number", proposal.getProposalNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ProposalEntity proposalEntity = proposalService.selectOne(queryWrapper);
        if(proposalEntity==null){
            proposal.setInsertTime(new Date());
            proposal.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      proposal.set
        //  }
            proposalService.insert(proposal);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ProposalEntity proposal, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,proposal:{}",this.getClass().getName(),proposal.toString());
        //根据字段查询是否有相同数据
        Wrapper<ProposalEntity> queryWrapper = new EntityWrapper<ProposalEntity>()
            .notIn("id",proposal.getId())
            .andNew()
            .eq("proposal_name", proposal.getProposalName())
            .eq("zirushouhcu_types", proposal.getZirushouhcuTypes())
            .eq("proposal_types", proposal.getProposalTypes())
            .eq("yonghu_id", proposal.getYonghuId())
            .eq("shifou_types", proposal.getShifouTypes())
            .eq("proposal_number", proposal.getProposalNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ProposalEntity proposalEntity = proposalService.selectOne(queryWrapper);
        if("".equals(proposal.getProposalPhoto()) || "null".equals(proposal.getProposalPhoto())){
                proposal.setProposalPhoto(null);
        }
        if(proposalEntity==null){
            //  String role = String.valueOf(request.getSession().getAttribute("role"));
            //  if("".equals(role)){
            //      proposal.set
            //  }
            proposalService.updateById(proposal);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        proposalService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
    * 拒绝
    */
    @RequestMapping("/jujue")
    public R jujue(Integer ids){
        ProposalEntity proposal = proposalService.selectById(ids);
        if(proposal == null){
            return R.error();
        }
        proposal.setShifouTypes(2);
        proposalService.updateById(proposal);
        return R.ok();
    }
    /**
    * 附议
    */
    @RequestMapping("/fuyi")
    public R fuyi(Integer ids, HttpServletRequest request){
        ProposalEntity proposal = proposalService.selectById(ids);
        if(proposal == null){
            return R.error();
        }
        proposal.setProposalNumber(proposal.getProposalNumber()+1);
        boolean b = proposalService.updateById(proposal);
        if(b){
            FuyijiluEntity fuyijilu = new FuyijiluEntity();
            fuyijilu.setCreateTime(new Date());
            fuyijilu.setInsertTime(new Date());
            fuyijilu.setYonghuId((Integer)request.getSession().getAttribute("userId"));
            fuyijilu.setProposalId(ids);
            Wrapper<FuyijiluEntity> queryWrapper = new EntityWrapper<FuyijiluEntity>()
                    .eq("proposal_id", fuyijilu.getProposalId())
                    .eq("yonghu_id", fuyijilu.getYonghuId())
                    ;
            logger.info("sql语句:"+queryWrapper.getSqlSegment());
            FuyijiluEntity fuyijiluEntity = fuyijiluService.selectOne(queryWrapper);
            if(fuyijiluEntity!=null){
                return R.error("你已经附议过了");
            }
            boolean i = fuyijiluService.insert(fuyijilu);
            if(i){
                return R.ok();
            }
        }
        return R.error();
    }

    /**
     * 同意
     */
    @RequestMapping("/tongyi")
    public R tongyi(Integer ids){
        ProposalEntity proposal = proposalService.selectById(ids);
        if(proposal == null){
            return R.error();
        }
        proposal.setShifouTypes(1);
        boolean b = proposalService.updateById(proposal);
        if(b){
            CaiwuEntity caiwu = caiwuService.selectById(1);
            if(proposal.getZirushouhcuTypes() == 1){
                caiwu.setCaiwuZhichu(caiwu.getCaiwuShouru()+ proposal.getProposalMoeny());
            }else{
                caiwu.setCaiwuShouru(caiwu.getCaiwuShouru()+ proposal.getProposalMoeny());
            }
            caiwuService.updateById(caiwu);
        }
        return R.ok();
    }


    /**
    * 前端列表
    */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(StringUtil.isNotEmpty(role) && "用户".equals(role)){
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        }
        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = proposalService.queryPage(params);

        //字典表数据转换
        List<ProposalView> list =(List<ProposalView>)page.getList();
        for(ProposalView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c);
        }
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ProposalEntity proposal = proposalService.selectById(id);
            if(proposal !=null){
                //entity转view
        ProposalView view = new ProposalView();
                BeanUtils.copyProperties( proposal , view );//把实体数据重构到view中

                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(proposal.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody ProposalEntity proposal, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,proposal:{}",this.getClass().getName(),proposal.toString());
        Wrapper<ProposalEntity> queryWrapper = new EntityWrapper<ProposalEntity>()
            .eq("proposal_name", proposal.getProposalName())
            .eq("zirushouhcu_types", proposal.getZirushouhcuTypes())
            .eq("proposal_types", proposal.getProposalTypes())
            .eq("yonghu_id", proposal.getYonghuId())
            .eq("shifou_types", proposal.getShifouTypes())
            .eq("proposal_number", proposal.getProposalNumber())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
    ProposalEntity proposalEntity = proposalService.selectOne(queryWrapper);
        if(proposalEntity==null){
            proposal.setInsertTime(new Date());
            proposal.setCreateTime(new Date());
        //  String role = String.valueOf(request.getSession().getAttribute("role"));
        //  if("".equals(role)){
        //      proposal.set
        //  }
        proposalService.insert(proposal);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}

