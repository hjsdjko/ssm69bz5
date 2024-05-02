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


import com.dao.HuiyuanzhuanquDao;
import com.entity.HuiyuanzhuanquEntity;
import com.service.HuiyuanzhuanquService;
import com.entity.vo.HuiyuanzhuanquVO;
import com.entity.view.HuiyuanzhuanquView;

@Service("huiyuanzhuanquService")
public class HuiyuanzhuanquServiceImpl extends ServiceImpl<HuiyuanzhuanquDao, HuiyuanzhuanquEntity> implements HuiyuanzhuanquService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanzhuanquEntity> page = this.selectPage(
                new Query<HuiyuanzhuanquEntity>(params).getPage(),
                new EntityWrapper<HuiyuanzhuanquEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanzhuanquEntity> wrapper) {
		  Page<HuiyuanzhuanquView> page =new Query<HuiyuanzhuanquView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanzhuanquVO> selectListVO(Wrapper<HuiyuanzhuanquEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanzhuanquVO selectVO(Wrapper<HuiyuanzhuanquEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanzhuanquView> selectListView(Wrapper<HuiyuanzhuanquEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanzhuanquView selectView(Wrapper<HuiyuanzhuanquEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
