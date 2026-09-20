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


import com.dao.RenwujinduDao;
import com.entity.RenwujinduEntity;
import com.service.RenwujinduService;
import com.entity.vo.RenwujinduVO;
import com.entity.view.RenwujinduView;

@Service("renwujinduService")
public class RenwujinduServiceImpl extends ServiceImpl<RenwujinduDao, RenwujinduEntity> implements RenwujinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwujinduEntity> page = this.selectPage(
                new Query<RenwujinduEntity>(params).getPage(),
                new EntityWrapper<RenwujinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwujinduEntity> wrapper) {
		  Page<RenwujinduView> page =new Query<RenwujinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwujinduVO> selectListVO(Wrapper<RenwujinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwujinduVO selectVO(Wrapper<RenwujinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwujinduView> selectListView(Wrapper<RenwujinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwujinduView selectView(Wrapper<RenwujinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RenwujinduEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RenwujinduEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RenwujinduEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
