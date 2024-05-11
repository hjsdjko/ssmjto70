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


import com.dao.YuyuelishiDao;
import com.entity.YuyuelishiEntity;
import com.service.YuyuelishiService;
import com.entity.vo.YuyuelishiVO;
import com.entity.view.YuyuelishiView;

@Service("yuyuelishiService")
public class YuyuelishiServiceImpl extends ServiceImpl<YuyuelishiDao, YuyuelishiEntity> implements YuyuelishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuelishiEntity> page = this.selectPage(
                new Query<YuyuelishiEntity>(params).getPage(),
                new EntityWrapper<YuyuelishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuelishiEntity> wrapper) {
		  Page<YuyuelishiView> page =new Query<YuyuelishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuyuelishiVO> selectListVO(Wrapper<YuyuelishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuyuelishiVO selectVO(Wrapper<YuyuelishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuyuelishiView> selectListView(Wrapper<YuyuelishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuelishiView selectView(Wrapper<YuyuelishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
