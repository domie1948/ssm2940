package com.entity.view;

import com.entity.FuyijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 附议记录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("fuyijilu")
public class FuyijiluView extends FuyijiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 proposal
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
				* 支出/收入的值
				*/
				private String zirushouhcuValue;
			/**
			* 涉及金额
			*/
			private Double proposalMoeny;
			/**
			* 提案类型
			*/
			private Integer proposalTypes;
				/**
				* 提案类型的值
				*/
				private String proposalValue;
			/**
			* 提案用户
			*/
			private Integer yonghuId;
			/**
			* 是否同意
			*/
			private Integer shifouTypes;
				/**
				* 是否同意的值
				*/
				private String shifouValue;
			/**
			* 附议人数
			*/
			private Integer proposalNumber;
			/**
			* 提案时间
			*/
			private Date insertTime;
			/**
			* 提案详情
			*/
			private String proposalContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public FuyijiluView() {

	}

	public FuyijiluView(FuyijiluEntity fuyijiluEntity) {
		try {
			BeanUtils.copyProperties(this, fuyijiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set proposal
					/**
					* 获取： 提案标题
					*/
					public String getProposalName() {
						return proposalName;
					}
					/**
					* 设置： 提案标题
					*/
					public void setProposalName(String proposalName) {
						this.proposalName = proposalName;
					}
					/**
					* 获取： 提案简略图
					*/
					public String getProposalPhoto() {
						return proposalPhoto;
					}
					/**
					* 设置： 提案简略图
					*/
					public void setProposalPhoto(String proposalPhoto) {
						this.proposalPhoto = proposalPhoto;
					}
					/**
					* 获取： 支出/收入
					*/
					public Integer getZirushouhcuTypes() {
						return zirushouhcuTypes;
					}
					/**
					* 设置： 支出/收入
					*/
					public void setZirushouhcuTypes(Integer zirushouhcuTypes) {
						this.zirushouhcuTypes = zirushouhcuTypes;
					}


						/**
						* 获取： 支出/收入的值
						*/
						public String getZirushouhcuValue() {
							return zirushouhcuValue;
						}
						/**
						* 设置： 支出/收入的值
						*/
						public void setZirushouhcuValue(String zirushouhcuValue) {
							this.zirushouhcuValue = zirushouhcuValue;
						}
					/**
					* 获取： 涉及金额
					*/
					public Double getProposalMoeny() {
						return proposalMoeny;
					}
					/**
					* 设置： 涉及金额
					*/
					public void setProposalMoeny(Double proposalMoeny) {
						this.proposalMoeny = proposalMoeny;
					}
					/**
					* 获取： 提案类型
					*/
					public Integer getProposalTypes() {
						return proposalTypes;
					}
					/**
					* 设置： 提案类型
					*/
					public void setProposalTypes(Integer proposalTypes) {
						this.proposalTypes = proposalTypes;
					}


						/**
						* 获取： 提案类型的值
						*/
						public String getProposalValue() {
							return proposalValue;
						}
						/**
						* 设置： 提案类型的值
						*/
						public void setProposalValue(String proposalValue) {
							this.proposalValue = proposalValue;
						}
					/**
					* 获取： 提案用户
					*/
					public Integer getYonghuId() {
						return yonghuId;
					}
					/**
					* 设置： 提案用户
					*/
					public void setYonghuId(Integer yonghuId) {
						this.yonghuId = yonghuId;
					}
					/**
					* 获取： 是否同意
					*/
					public Integer getShifouTypes() {
						return shifouTypes;
					}
					/**
					* 设置： 是否同意
					*/
					public void setShifouTypes(Integer shifouTypes) {
						this.shifouTypes = shifouTypes;
					}


						/**
						* 获取： 是否同意的值
						*/
						public String getShifouValue() {
							return shifouValue;
						}
						/**
						* 设置： 是否同意的值
						*/
						public void setShifouValue(String shifouValue) {
							this.shifouValue = shifouValue;
						}
					/**
					* 获取： 附议人数
					*/
					public Integer getProposalNumber() {
						return proposalNumber;
					}
					/**
					* 设置： 附议人数
					*/
					public void setProposalNumber(Integer proposalNumber) {
						this.proposalNumber = proposalNumber;
					}
					/**
					* 获取： 提案时间
					*/
					public Date getInsertTime() {
						return insertTime;
					}
					/**
					* 设置： 提案时间
					*/
					public void setInsertTime(Date insertTime) {
						this.insertTime = insertTime;
					}
					/**
					* 获取： 提案详情
					*/
					public String getProposalContent() {
						return proposalContent;
					}
					/**
					* 设置： 提案详情
					*/
					public void setProposalContent(String proposalContent) {
						this.proposalContent = proposalContent;
					}




				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
