package com.dao;

import com.entity.RenwujinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwujinduVO;
import com.entity.view.RenwujinduView;


/**
 * 任务进度
 * 
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RenwujinduDao extends BaseMapper<RenwujinduEntity> {
	
	List<RenwujinduVO> selectListVO(@Param("ew") Wrapper<RenwujinduEntity> wrapper);
	
	RenwujinduVO selectVO(@Param("ew") Wrapper<RenwujinduEntity> wrapper);
	
	List<RenwujinduView> selectListView(@Param("ew") Wrapper<RenwujinduEntity> wrapper);

	List<RenwujinduView> selectListView(Pagination page,@Param("ew") Wrapper<RenwujinduEntity> wrapper);
	
	RenwujinduView selectView(@Param("ew") Wrapper<RenwujinduEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinduEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinduEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<RenwujinduEntity> wrapper);



}
