package com.entity.model;

import com.entity.RijizhoubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 日记周报
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public class RijizhoubaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日记类型
	 */
	
	private String rijileixing;
		
	/**
	 * 日期日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
