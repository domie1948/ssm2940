package com.entity.model;

import com.entity.CaiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 财务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-13
 */
public class CaiwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 支出金额
     */
    private Integer caiwuZhichu;


    /**
     * 收入金额
     */
    private Integer caiwuShouru;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：支出金额
	 */
    public Integer getCaiwuZhichu() {
        return caiwuZhichu;
    }


    /**
	 * 设置：支出金额
	 */
    public void setCaiwuZhichu(Integer caiwuZhichu) {
        this.caiwuZhichu = caiwuZhichu;
    }
    /**
	 * 获取：收入金额
	 */
    public Integer getCaiwuShouru() {
        return caiwuShouru;
    }


    /**
	 * 设置：收入金额
	 */
    public void setCaiwuShouru(Integer caiwuShouru) {
        this.caiwuShouru = caiwuShouru;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
