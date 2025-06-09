package com.entity.view;

import com.entity.ProposalEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 提案
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-13
 */
@TableName("proposal")
public class ProposalView extends ProposalEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 支出/收入的值
		*/
		private String zirushouhcuValue;
		/**
		* 提案类型的值
		*/
		private String proposalValue;
		/**
		* 是否同意的值
		*/
		private String shifouValue;



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

	public ProposalView() {

	}

	public ProposalView(ProposalEntity proposalEntity) {
		try {
			BeanUtils.copyProperties(this, proposalEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
