package com.dao;

import com.entity.RenwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuxinxiVO;
import com.entity.view.RenwuxinxiView;


/**
 * 任务信息
 * 
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RenwuxinxiDao extends BaseMapper<RenwuxinxiEntity> {
	
	List<RenwuxinxiVO> selectListVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiVO selectVO(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	List<RenwuxinxiView> selectListView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);

	List<RenwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	
	RenwuxinxiView selectView(@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwuxinxiEntity> wrapper);



}
