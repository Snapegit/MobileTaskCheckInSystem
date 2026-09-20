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
 * 奖惩信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:09
 */
@TableName("jiangchengxinxi")
public class JiangchengxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiangchengxinxiEntity() {
		
	}
	
	public JiangchengxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 奖惩名称
	 */
					
	private String jiangchengmingcheng;
	
	/**
	 * 奖惩类型
	 */
					
	private String jiangchengleixing;
	
	/**
	 * 奖惩内容
	 */
					
	private String jiangchengneirong;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 登记日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：奖惩名称
	 */
	public void setJiangchengmingcheng(String jiangchengmingcheng) {
		this.jiangchengmingcheng = jiangchengmingcheng;
	}
	/**
	 * 获取：奖惩名称
	 */
	public String getJiangchengmingcheng() {
		return jiangchengmingcheng;
	}
	/**
	 * 设置：奖惩类型
	 */
	public void setJiangchengleixing(String jiangchengleixing) {
		this.jiangchengleixing = jiangchengleixing;
	}
	/**
	 * 获取：奖惩类型
	 */
	public String getJiangchengleixing() {
		return jiangchengleixing;
	}
	/**
	 * 设置：奖惩内容
	 */
	public void setJiangchengneirong(String jiangchengneirong) {
		this.jiangchengneirong = jiangchengneirong;
	}
	/**
	 * 获取：奖惩内容
	 */
	public String getJiangchengneirong() {
		return jiangchengneirong;
	}
	/**
	 * 设置：用户名
	 */
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：登记日期
	 */
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}

}
