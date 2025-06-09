package com.entity.model;

import com.entity.ProposalEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 提案
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-13
 */
public class ProposalModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 提案标题
     */
    private String proposalName;


    /**
     * 提案简略图
     */
    private String proposalPhoto;


    /**
     * 支出/收入
     */
    private Integer zirushouhcuTypes;


    /**
     * 涉及金额
     */
    private Double proposalMoeny;


    /**
     * 提案类型
     */
    private Integer proposalTypes;


    /**
     * 提案用户
     */
    private Integer yonghuId;


    /**
     * 是否同意
     */
    private Integer shifouTypes;


    /**
     * 附议人数
     */
    private Integer proposalNumber;


    /**
     * 提案时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 提案详情
     */
    private String proposalContent;


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
	 * 获取：提案标题
	 */
    public String getProposalName() {
        return proposalName;
    }


    /**
	 * 设置：提案标题
	 */
    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }
    /**
	 * 获取：提案简略图
	 */
    public String getProposalPhoto() {
        return proposalPhoto;
    }


    /**
	 * 设置：提案简略图
	 */
    public void setProposalPhoto(String proposalPhoto) {
        this.proposalPhoto = proposalPhoto;
    }
    /**
	 * 获取：支出/收入
	 */
    public Integer getZirushouhcuTypes() {
        return zirushouhcuTypes;
    }


    /**
	 * 设置：支出/收入
	 */
    public void setZirushouhcuTypes(Integer zirushouhcuTypes) {
        this.zirushouhcuTypes = zirushouhcuTypes;
    }
    /**
	 * 获取：涉及金额
	 */
    public Double getProposalMoeny() {
        return proposalMoeny;
    }


    /**
	 * 设置：涉及金额
	 */
    public void setProposalMoeny(Double proposalMoeny) {
        this.proposalMoeny = proposalMoeny;
    }
    /**
	 * 获取：提案类型
	 */
    public Integer getProposalTypes() {
        return proposalTypes;
    }


    /**
	 * 设置：提案类型
	 */
    public void setProposalTypes(Integer proposalTypes) {
        this.proposalTypes = proposalTypes;
    }
    /**
	 * 获取：提案用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：提案用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getShifouTypes() {
        return shifouTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setShifouTypes(Integer shifouTypes) {
        this.shifouTypes = shifouTypes;
    }
    /**
	 * 获取：附议人数
	 */
    public Integer getProposalNumber() {
        return proposalNumber;
    }


    /**
	 * 设置：附议人数
	 */
    public void setProposalNumber(Integer proposalNumber) {
        this.proposalNumber = proposalNumber;
    }
    /**
	 * 获取：提案时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：提案时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：提案详情
	 */
    public String getProposalContent() {
        return proposalContent;
    }


    /**
	 * 设置：提案详情
	 */
    public void setProposalContent(String proposalContent) {
        this.proposalContent = proposalContent;
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
