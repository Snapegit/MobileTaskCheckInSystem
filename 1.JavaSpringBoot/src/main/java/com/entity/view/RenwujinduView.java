package com.entity.view;

import com.entity.RenwujinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 任务进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
@TableName("renwujindu")
public class RenwujinduView  extends RenwujinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwujinduView(){
	}
 
 	public RenwujinduView(RenwujinduEntity renwujinduEntity){
 	try {
			BeanUtils.copyProperties(this, renwujinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
