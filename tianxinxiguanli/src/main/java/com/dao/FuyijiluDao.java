package com.dao;

import com.entity.FuyijiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FuyijiluView;

/**
 * 附议记录 Dao 接口
 *
 * @author 
 * @since 2021-04-13
 */
public interface FuyijiluDao extends BaseMapper<FuyijiluEntity> {

   List<FuyijiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
