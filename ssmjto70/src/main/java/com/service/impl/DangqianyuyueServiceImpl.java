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


import com.dao.DangqianyuyueDao;
import com.entity.DangqianyuyueEntity;
import com.service.DangqianyuyueService;
import com.entity.vo.DangqianyuyueVO;
import com.entity.view.DangqianyuyueView;

@Service("dangqianyuyueService")
public class DangqianyuyueServiceImpl extends ServiceImpl<DangqianyuyueDao, DangqianyuyueEntity> implements DangqianyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DangqianyuyueEntity> page = this.selectPage(
                new Query<DangqianyuyueEntity>(params).getPage(),
                new EntityWrapper<DangqianyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DangqianyuyueEntity> wrapper) {
		  Page<DangqianyuyueView> page =new Query<DangqianyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DangqianyuyueVO> selectListVO(Wrapper<DangqianyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DangqianyuyueVO selectVO(Wrapper<DangqianyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DangqianyuyueView> selectListView(Wrapper<DangqianyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DangqianyuyueView selectView(Wrapper<DangqianyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
