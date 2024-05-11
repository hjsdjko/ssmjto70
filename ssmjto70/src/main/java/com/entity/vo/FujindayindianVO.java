package com.entity.vo;

import com.entity.FujindayindianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 附近打印店
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-26 18:15:48
 */
public class FujindayindianVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 营业时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date yingyeshijian;
		
	/**
	 * 营业执照
	 */
	
	private String yingyezhizhao;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 打印价格
	 */
	
	private Integer dayinjiage;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：营业时间
	 */
	 
	public void setYingyeshijian(Date yingyeshijian) {
		this.yingyeshijian = yingyeshijian;
	}
	
	/**
	 * 获取：营业时间
	 */
	public Date getYingyeshijian() {
		return yingyeshijian;
	}
				
	
	/**
	 * 设置：营业执照
	 */
	 
	public void setYingyezhizhao(String yingyezhizhao) {
		this.yingyezhizhao = yingyezhizhao;
	}
	
	/**
	 * 获取：营业执照
	 */
	public String getYingyezhizhao() {
		return yingyezhizhao;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：打印价格
	 */
	 
	public void setDayinjiage(Integer dayinjiage) {
		this.dayinjiage = dayinjiage;
	}
	
	/**
	 * 获取：打印价格
	 */
	public Integer getDayinjiage() {
		return dayinjiage;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
