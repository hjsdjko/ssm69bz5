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


import com.dao.DiscusshuiyuanzhuanquDao;
import com.entity.DiscusshuiyuanzhuanquEntity;
import com.service.DiscusshuiyuanzhuanquService;
import com.entity.vo.DiscusshuiyuanzhuanquVO;
import com.entity.view.DiscusshuiyuanzhuanquView;

@Service("discusshuiyuanzhuanquService")
public class DiscusshuiyuanzhuanquServiceImpl extends ServiceImpl<DiscusshuiyuanzhuanquDao, DiscusshuiyuanzhuanquEntity> implements DiscusshuiyuanzhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuiyuanzhuanquEntity> page = this.selectPage(
                new Query<DiscusshuiyuanzhuanquEntity>(params).getPage(),
                new EntityWrapper<DiscusshuiyuanzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuiyuanzhuanquEntity> wrapper) {
		  Page<DiscusshuiyuanzhuanquView> page =new Query<DiscusshuiyuanzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuiyuanzhuanquVO> selectListVO(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuiyuanzhuanquVO selectVO(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuiyuanzhuanquView> selectListView(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuiyuanzhuanquView selectView(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
