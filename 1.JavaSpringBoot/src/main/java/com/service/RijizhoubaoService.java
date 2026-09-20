package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RijizhoubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RijizhoubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RijizhoubaoView;


/**
 * 日记周报
 *
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RijizhoubaoService extends IService<RijizhoubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RijizhoubaoVO> selectListVO(Wrapper<RijizhoubaoEntity> wrapper);
   	
   	RijizhoubaoVO selectVO(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
   	
   	List<RijizhoubaoView> selectListView(Wrapper<RijizhoubaoEntity> wrapper);
   	
   	RijizhoubaoView selectView(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RijizhoubaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<RijizhoubaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<RijizhoubaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<RijizhoubaoEntity> wrapper);



}

