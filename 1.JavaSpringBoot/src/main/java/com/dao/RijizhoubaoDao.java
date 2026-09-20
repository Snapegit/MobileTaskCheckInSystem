package com.dao;

import com.entity.RijizhoubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RijizhoubaoVO;
import com.entity.view.RijizhoubaoView;


/**
 * 日记周报
 * 
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RijizhoubaoDao extends BaseMapper<RijizhoubaoEntity> {
	
	List<RijizhoubaoVO> selectListVO(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
	
	RijizhoubaoVO selectVO(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
	
	List<RijizhoubaoView> selectListView(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);

	List<RijizhoubaoView> selectListView(Pagination page,@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
	
	RijizhoubaoView selectView(@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RijizhoubaoEntity> wrapper);



}
