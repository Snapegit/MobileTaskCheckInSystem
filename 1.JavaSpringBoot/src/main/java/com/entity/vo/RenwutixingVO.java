package com.entity.vo;

import com.entity.RenwutixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 任务提醒
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public class RenwutixingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 提醒图片
	 */
	
	private String tixingtupian;
		
	/**
	 * 提醒日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
