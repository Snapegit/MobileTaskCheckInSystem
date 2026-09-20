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
 * 任务提醒
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
@TableName("renwutixing")
public class RenwutixingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RenwutixingEntity() {
		
	}
	
	public RenwutixingEntity(T t) {
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
	 * 提醒名称
	 */
					
	private String tixingmingcheng;
	
	/**
	 * 提醒图片
	 */
					
	private String tixingtupian;
	
	/**
	 * 提醒日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tixingriqi;
	
	/**
	 * 提醒内容
	 */
					
	private String tixingneirong;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	
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
	 * 设置：提醒名称
	 */
	public void setTixingmingcheng(String tixingmingcheng) {
		this.tixingmingcheng = tixingmingcheng;
	}
	/**
	 * 获取：提醒名称
	 */
	public String getTixingmingcheng() {
		return tixingmingcheng;
	}
	/**
	 * 设置：提醒图片
	 */
	public void setTixingtupian(String tixingtupian) {
		this.tixingtupian = tixingtupian;
	}
	/**
	 * 获取：提醒图片
	 */
	public String getTixingtupian() {
		return tixingtupian;
	}
	/**
	 * 设置：提醒日期
	 */
	public void setTixingriqi(Date tixingriqi) {
		this.tixingriqi = tixingriqi;
	}
	/**
	 * 获取：提醒日期
	 */
	public Date getTixingriqi() {
		return tixingriqi;
	}
	/**
	 * 设置：提醒内容
	 */
	public void setTixingneirong(String tixingneirong) {
		this.tixingneirong = tixingneirong;
	}
	/**
	 * 获取：提醒内容
	 */
	public String getTixingneirong() {
		return tixingneirong;
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

}
