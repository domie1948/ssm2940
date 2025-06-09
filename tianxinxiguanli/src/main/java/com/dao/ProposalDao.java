package com.dao;

import com.entity.ProposalEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ProposalView;

/**
 * 提案 Dao 接口
 *
 * @author 
 * @since 2021-04-13
 */
public interface ProposalDao extends BaseMapper<ProposalEntity> {

   List<ProposalView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
