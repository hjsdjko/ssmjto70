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


import com.dao.FujindayindianDao;
import com.entity.FujindayindianEntity;
import com.service.FujindayindianService;
import com.entity.vo.FujindayindianVO;
import com.entity.view.FujindayindianView;

@Service("fujindayindianService")
public class FujindayindianServiceImpl extends ServiceImpl<FujindayindianDao, FujindayindianEntity> implements FujindayindianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FujindayindianEntity> page = this.selectPage(
                new Query<FujindayindianEntity>(params).getPage(),
                new EntityWrapper<FujindayindianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FujindayindianEntity> wrapper) {
		  Page<FujindayindianView> page =new Query<FujindayindianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FujindayindianVO> selectListVO(Wrapper<FujindayindianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FujindayindianVO selectVO(Wrapper<FujindayindianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FujindayindianView> selectListView(Wrapper<FujindayindianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FujindayindianView selectView(Wrapper<FujindayindianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
