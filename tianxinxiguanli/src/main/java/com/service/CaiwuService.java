package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CaiwuEntity;
import java.util.Map;

/**
 * 财务 服务类
 * @author 
 * @since 2021-04-13
 */
public interface CaiwuService extends IService<CaiwuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}