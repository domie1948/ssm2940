package com.entity.vo;

import com.entity.FuyijiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 附议记录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("fuyijilu")
public class FuyijiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 附议提案
     */

    @TableField(value = "proposal_id")
    private Integer proposalId;


    /**
     * 附议人
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 附议时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：附议提案
	 */
    public Integer getProposalId() {
        return proposalId;
    }


    /**
	 * 获取：附议提案
	 */

    public void setProposalId(Integer proposalId) {
        this.proposalId = proposalId;
    }
    /**
	 * 设置：附议人
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：附议人
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：附议时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：附议时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
