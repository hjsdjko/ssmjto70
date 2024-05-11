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


import com.dao.DiscussfujindayindianDao;
import com.entity.DiscussfujindayindianEntity;
import com.service.DiscussfujindayindianService;
import com.entity.vo.DiscussfujindayindianVO;
import com.entity.view.DiscussfujindayindianView;

@Service("discussfujindayindianService")
public class DiscussfujindayindianServiceImpl extends ServiceImpl<DiscussfujindayindianDao, DiscussfujindayindianEntity> implements DiscussfujindayindianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfujindayindianEntity> page = this.selectPage(
                new Query<DiscussfujindayindianEntity>(params).getPage(),
                new EntityWrapper<DiscussfujindayindianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfujindayindianEntity> wrapper) {
		  Page<DiscussfujindayindianView> page =new Query<DiscussfujindayindianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfujindayindianVO> selectListVO(Wrapper<DiscussfujindayindianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfujindayindianVO selectVO(Wrapper<DiscussfujindayindianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfujindayindianView> selectListView(Wrapper<DiscussfujindayindianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfujindayindianView selectView(Wrapper<DiscussfujindayindianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
