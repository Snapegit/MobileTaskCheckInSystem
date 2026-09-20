package com.dao;

import com.entity.RenwutixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwutixingVO;
import com.entity.view.RenwutixingView;


/**
 * 任务提醒
 * 
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
public interface RenwutixingDao extends BaseMapper<RenwutixingEntity> {
	
	List<RenwutixingVO> selectListVO(@Param("ew") Wrapper<RenwutixingEntity> wrapper);
	
	RenwutixingVO selectVO(@Param("ew") Wrapper<RenwutixingEntity> wrapper);
	
	List<RenwutixingView> selectListView(@Param("ew") Wrapper<RenwutixingEntity> wrapper);

	List<RenwutixingView> selectListView(Pagination page,@Param("ew") Wrapper<RenwutixingEntity> wrapper);
	
	RenwutixingView selectView(@Param("ew") Wrapper<RenwutixingEntity> wrapper);
	

}
