package com.entity.view;

import com.entity.RijizhoubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 日记周报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
@TableName("rijizhoubao")
public class RijizhoubaoView  extends RijizhoubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RijizhoubaoView(){
	}
 
 	public RijizhoubaoView(RijizhoubaoEntity rijizhoubaoEntity){
 	try {
			BeanUtils.copyProperties(this, rijizhoubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
