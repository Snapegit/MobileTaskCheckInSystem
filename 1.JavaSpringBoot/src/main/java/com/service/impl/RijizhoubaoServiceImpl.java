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


import com.dao.RijizhoubaoDao;
import com.entity.RijizhoubaoEntity;
import com.service.RijizhoubaoService;
import com.entity.vo.RijizhoubaoVO;
import com.entity.view.RijizhoubaoView;

@Service("rijizhoubaoService")
public class RijizhoubaoServiceImpl extends ServiceImpl<RijizhoubaoDao, RijizhoubaoEntity> implements RijizhoubaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RijizhoubaoEntity> page = this.selectPage(
                new Query<RijizhoubaoEntity>(params).getPage(),
                new EntityWrapper<RijizhoubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RijizhoubaoEntity> wrapper) {
		  Page<RijizhoubaoView> page =new Query<RijizhoubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RijizhoubaoVO> selectListVO(Wrapper<RijizhoubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RijizhoubaoVO selectVO(Wrapper<RijizhoubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RijizhoubaoView> selectListView(Wrapper<RijizhoubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RijizhoubaoView selectView(Wrapper<RijizhoubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<RijizhoubaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<RijizhoubaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<RijizhoubaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
