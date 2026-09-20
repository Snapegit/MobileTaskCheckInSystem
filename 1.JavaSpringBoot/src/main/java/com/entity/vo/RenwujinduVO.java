package com.entity.vo;

import com.entity.RenwujinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 任务进度
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public class RenwujinduVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 任务分类
	 */
	
	private String renwufenlei;
		
	/**
	 * 任务图片
	 */
	
	private String renwutupian;
		
	/**
	 * 任务进度
	 */
	
	private String renwujindu;
		
	/**
	 * 打卡人数
	 */
	
	private Integer dakarenshu;
		
	/**
	 * 打卡时长
	 */
	
	private Integer dakashizhang;
		
	/**
	 * 积分奖励
	 */
	
	private Integer jifen;
		
	/**
	 * 打卡日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakariqi;
		
	/**
	 * 打卡体会
	 */
	
	private String dakatihui;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 回复内容
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：任务分类
	 */
	 
	public void setRenwufenlei(String renwufenlei) {
		this.renwufenlei = renwufenlei;
	}
	
	/**
	 * 获取：任务分类
	 */
	public String getRenwufenlei() {
		return renwufenlei;
	}
				
	
	/**
	 * 设置：任务图片
	 */
	 
	public void setRenwutupian(String renwutupian) {
		this.renwutupian = renwutupian;
	}
	
	/**
	 * 获取：任务图片
	 */
	public String getRenwutupian() {
		return renwutupian;
	}
				
	
	/**
	 * 设置：任务进度
	 */
	 
	public void setRenwujindu(String renwujindu) {
		this.renwujindu = renwujindu;
	}
	
	/**
	 * 获取：任务进度
	 */
	public String getRenwujindu() {
		return renwujindu;
	}
				
	
	/**
	 * 设置：打卡人数
	 */
	 
	public void setDakarenshu(Integer dakarenshu) {
		this.dakarenshu = dakarenshu;
	}
	
	/**
	 * 获取：打卡人数
	 */
	public Integer getDakarenshu() {
		return dakarenshu;
	}
				
	
	/**
	 * 设置：打卡时长
	 */
	 
	public void setDakashizhang(Integer dakashizhang) {
		this.dakashizhang = dakashizhang;
	}
	
	/**
	 * 获取：打卡时长
	 */
	public Integer getDakashizhang() {
		return dakashizhang;
	}
				
	
	/**
	 * 设置：积分奖励
	 */
	 
	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分奖励
	 */
	public Integer getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：打卡日期
	 */
	 
	public void setDakariqi(Date dakariqi) {
		this.dakariqi = dakariqi;
	}
	
	/**
	 * 获取：打卡日期
	 */
	public Date getDakariqi() {
		return dakariqi;
	}
				
	
	/**
	 * 设置：打卡体会
	 */
	 
	public void setDakatihui(String dakatihui) {
		this.dakatihui = dakatihui;
	}
	
	/**
	 * 获取：打卡体会
	 */
	public String getDakatihui() {
		return dakatihui;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
