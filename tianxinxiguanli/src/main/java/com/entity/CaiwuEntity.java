package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 财务
 *
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("caiwu")
public class CaiwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaiwuEntity() {

	}

	public CaiwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 支出金额
     */
    @TableField(value = "caiwu_zhichu")

    private Double caiwuZhichu;


    /**
     * 收入金额
     */
    @TableField(value = "caiwu_shouru")

    private Double caiwuShouru;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
    public Double getCaiwuZhichu() {
        return caiwuZhichu;
    }


    /**
	 * 获取：支出金额
	 */

    public void setCaiwuZhichu(Double caiwuZhichu) {
        this.caiwuZhichu = caiwuZhichu;
    }
    /**
	 * 设置：收入金额
	 */
    public Double getCaiwuShouru() {
        return caiwuShouru;
    }


    /**
	 * 获取：收入金额
	 */

    public void setCaiwuShouru(Double caiwuShouru) {
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

    @Override
    public String toString() {
        return "Caiwu{" +
            "id=" + id +
            ", caiwuZhichu=" + caiwuZhichu +
            ", caiwuShouru=" + caiwuShouru +
            ", createTime=" + createTime +
        "}";
    }
}
