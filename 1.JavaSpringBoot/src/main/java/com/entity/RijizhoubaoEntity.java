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
 * 日记周报
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
@TableName("rijizhoubao")
public class RijizhoubaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RijizhoubaoEntity() {
		
	}
	
	public RijizhoubaoEntity(T t) {
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
	 * 日记名称
	 */
					
	private String rijimingcheng;
	
	/**
	 * 日记类型
	 */
					
	private String rijileixing;
	
	/**
	 * 日期日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqiriqi;
	
	/**
	 * 图片信息
	 */
					
	private String tupianxinxi;
	
	/**
	 * 日记内容
	 */
					
	private String rijineirong;
	
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
	 * 设置：日记名称
	 */
	public void setRijimingcheng(String rijimingcheng) {
		this.rijimingcheng = rijimingcheng;
	}
	/**
	 * 获取：日记名称
	 */
	public String getRijimingcheng() {
		return rijimingcheng;
	}
	/**
	 * 设置：日记类型
	 */
	public void setRijileixing(String rijileixing) {
		this.rijileixing = rijileixing;
	}
	/**
	 * 获取：日记类型
	 */
	public String getRijileixing() {
		return rijileixing;
	}
	/**
	 * 设置：日期日期
	 */
	public void setRiqiriqi(Date riqiriqi) {
		this.riqiriqi = riqiriqi;
	}
	/**
	 * 获取：日期日期
	 */
	public Date getRiqiriqi() {
		return riqiriqi;
	}
	/**
	 * 设置：图片信息
	 */
	public void setTupianxinxi(String tupianxinxi) {
		this.tupianxinxi = tupianxinxi;
	}
	/**
	 * 获取：图片信息
	 */
	public String getTupianxinxi() {
		return tupianxinxi;
	}
	/**
	 * 设置：日记内容
	 */
	public void setRijineirong(String rijineirong) {
		this.rijineirong = rijineirong;
	}
	/**
	 * 获取：日记内容
	 */
	public String getRijineirong() {
		return rijineirong;
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
