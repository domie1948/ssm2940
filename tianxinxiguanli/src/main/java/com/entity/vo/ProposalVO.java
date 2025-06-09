package com.entity.vo;

import com.entity.ProposalEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 提案
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("proposal")
public class ProposalVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 提案标题
     */

    @TableField(value = "proposal_name")
    private String proposalName;


    /**
     * 提案简略图
     */

    @TableField(value = "proposal_photo")
    private String proposalPhoto;


    /**
     * 支出/收入
     */

    @TableField(value = "zirushouhcu_types")
    private Integer zirushouhcuTypes;


    /**
     * 涉及金额
     */

    @TableField(value = "proposal_moeny")
    private Double proposalMoeny;


    /**
     * 提案类型
     */

    @TableField(value = "proposal_types")
    private Integer proposalTypes;


    /**
     * 提案用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 是否同意
     */

    @TableField(value = "shifou_types")
    private Integer shifouTypes;


    /**
     * 附议人数
     */

    @TableField(value = "proposal_number")
    private Integer proposalNumber;


    /**
     * 提案时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 提案详情
     */

    @TableField(value = "proposal_content")
    private String proposalContent;


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
	 * 设置：提案标题
	 */
    public String getProposalName() {
        return proposalName;
    }


    /**
	 * 获取：提案标题
	 */

    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }
    /**
	 * 设置：提案简略图
	 */
    public String getProposalPhoto() {
        return proposalPhoto;
    }


    /**
	 * 获取：提案简略图
	 */

    public void setProposalPhoto(String proposalPhoto) {
        this.proposalPhoto = proposalPhoto;
    }
    /**
	 * 设置：支出/收入
	 */
    public Integer getZirushouhcuTypes() {
        return zirushouhcuTypes;
    }


    /**
	 * 获取：支出/收入
	 */

    public void setZirushouhcuTypes(Integer zirushouhcuTypes) {
        this.zirushouhcuTypes = zirushouhcuTypes;
    }
    /**
	 * 设置：涉及金额
	 */
    public Double getProposalMoeny() {
        return proposalMoeny;
    }


    /**
	 * 获取：涉及金额
	 */

    public void setProposalMoeny(Double proposalMoeny) {
        this.proposalMoeny = proposalMoeny;
    }
    /**
	 * 设置：提案类型
	 */
    public Integer getProposalTypes() {
        return proposalTypes;
    }


    /**
	 * 获取：提案类型
	 */

    public void setProposalTypes(Integer proposalTypes) {
        this.proposalTypes = proposalTypes;
    }
    /**
	 * 设置：提案用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：提案用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
    }
    /**
	 * 设置：附议人数
	 */
    public Integer getProposalNumber() {
        return proposalNumber;
    }


    /**
	 * 获取：附议人数
	 */

    public void setProposalNumber(Integer proposalNumber) {
        this.proposalNumber = proposalNumber;
    }
    /**
	 * 设置：提案时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：提案时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：提案详情
	 */
    public String getProposalContent() {
        return proposalContent;
    }


    /**
	 * 获取：提案详情
	 */

    public void setProposalContent(String proposalContent) {
        this.proposalContent = proposalContent;
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
