package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RenwutixingEntity;
import com.entity.view.RenwutixingView;

import com.service.RenwutixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 任务提醒
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-18 07:44:08
 */
@RestController
@RequestMapping("/renwutixing")
public class RenwutixingController {
    @Autowired
    private RenwutixingService renwutixingService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RenwutixingEntity renwutixing,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tixingriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tixingriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			renwutixing.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RenwutixingEntity> ew = new EntityWrapper<RenwutixingEntity>();
                if(tixingriqistart!=null) ew.ge("tixingriqi", tixingriqistart);
                if(tixingriqiend!=null) ew.le("tixingriqi", tixingriqiend);

		PageUtils page = renwutixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwutixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RenwutixingEntity renwutixing, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tixingriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date tixingriqiend,
		HttpServletRequest request){
        EntityWrapper<RenwutixingEntity> ew = new EntityWrapper<RenwutixingEntity>();
                if(tixingriqistart!=null) ew.ge("tixingriqi", tixingriqistart);
                if(tixingriqiend!=null) ew.le("tixingriqi", tixingriqiend);

		PageUtils page = renwutixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, renwutixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RenwutixingEntity renwutixing){
       	EntityWrapper<RenwutixingEntity> ew = new EntityWrapper<RenwutixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( renwutixing, "renwutixing")); 
        return R.ok().put("data", renwutixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RenwutixingEntity renwutixing){
        EntityWrapper< RenwutixingEntity> ew = new EntityWrapper< RenwutixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( renwutixing, "renwutixing")); 
		RenwutixingView renwutixingView =  renwutixingService.selectView(ew);
		return R.ok("查询任务提醒成功").put("data", renwutixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RenwutixingEntity renwutixing = renwutixingService.selectById(id);
        return R.ok().put("data", renwutixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RenwutixingEntity renwutixing = renwutixingService.selectById(id);
        return R.ok().put("data", renwutixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RenwutixingEntity renwutixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwutixing);
        renwutixingService.insert(renwutixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RenwutixingEntity renwutixing, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(renwutixing);
        renwutixingService.insert(renwutixing);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RenwutixingEntity renwutixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(renwutixing);
        renwutixingService.updateById(renwutixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        renwutixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
