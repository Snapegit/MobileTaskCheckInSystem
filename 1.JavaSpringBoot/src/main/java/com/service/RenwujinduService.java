package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwujinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwujinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwujinduView;


/**
 * 任务进度
 *
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RenwujinduService extends IService<RenwujinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwujinduVO> selectListVO(Wrapper<RenwujinduEntity> wrapper);
   	
   	RenwujinduVO selectVO(@Param("ew") Wrapper<RenwujinduEntity> wrapper);
   	
   	List<RenwujinduView> selectListView(Wrapper<RenwujinduEntity> wrapper);
   	
   	RenwujinduView selectView(@Param("ew") Wrapper<RenwujinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwujinduEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RenwujinduEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RenwujinduEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RenwujinduEntity> wrapper);



}

