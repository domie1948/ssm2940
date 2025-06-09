package com.entity.vo;

import com.entity.CaiwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 财务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("caiwu")
public class CaiwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 支出金额
     */

    @TableField(value = "caiwu_zhichu")
    private Integer caiwuZhichu;


    /**
     * 收入金额
     */

    @TableField(value = "caiwu_shouru")
    private Integer caiwuShouru;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：支出金额
	 */
    public Integer getCaiwuZhichu() {
        return caiwuZhichu;
    }


    /**
	 * 获取：支出金额
	 */

    public void setCaiwuZhichu(Integer caiwuZhichu) {
        this.caiwuZhichu = caiwuZhichu;
    }
    /**
	 * 设置：收入金额
	 */
    public Integer getCaiwuShouru() {
        return caiwuShouru;
    }


    /**
	 * 获取：收入金额
	 */

    public void setCaiwuShouru(Integer caiwuShouru) {
        this.caiwuShouru = caiwuShouru;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
