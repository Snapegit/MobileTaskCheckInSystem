package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwutixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwutixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwutixingView;


/**
 * 任务提醒
 *
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RenwutixingService extends IService<RenwutixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwutixingVO> selectListVO(Wrapper<RenwutixingEntity> wrapper);
   	
   	RenwutixingVO selectVO(@Param("ew") Wrapper<RenwutixingEntity> wrapper);
   	
   	List<RenwutixingView> selectListView(Wrapper<RenwutixingEntity> wrapper);
   	
   	RenwutixingView selectView(@Param("ew") Wrapper<RenwutixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwutixingEntity> wrapper);
   	

}

