package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.RenwutixingDao;
import com.entity.RenwutixingEntity;
import com.service.RenwutixingService;
import com.entity.vo.RenwutixingVO;
import com.entity.view.RenwutixingView;

@Service("renwutixingService")
public class RenwutixingServiceImpl extends ServiceImpl<RenwutixingDao, RenwutixingEntity> implements RenwutixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwutixingEntity> page = this.selectPage(
                new Query<RenwutixingEntity>(params).getPage(),
                new EntityWrapper<RenwutixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwutixingEntity> wrapper) {
		  Page<RenwutixingView> page =new Query<RenwutixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwutixingVO> selectListVO(Wrapper<RenwutixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwutixingVO selectVO(Wrapper<RenwutixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwutixingView> selectListView(Wrapper<RenwutixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwutixingView selectView(Wrapper<RenwutixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
