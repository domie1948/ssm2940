package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ProposalEntity;
import java.util.Map;

/**
 * 提案 服务类
 * @author 
 * @since 2021-04-13
 */
public interface ProposalService extends IService<ProposalEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}