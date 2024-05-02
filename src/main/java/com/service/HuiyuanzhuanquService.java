package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanzhuanquView;


/**
 * 会员专区
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:55:58
 */
public interface HuiyuanzhuanquService extends IService<HuiyuanzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanzhuanquVO> selectListVO(Wrapper<HuiyuanzhuanquEntity> wrapper);
   	
   	HuiyuanzhuanquVO selectVO(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
   	
   	List<HuiyuanzhuanquView> selectListView(Wrapper<HuiyuanzhuanquEntity> wrapper);
   	
   	HuiyuanzhuanquView selectView(@Param("ew") Wrapper<HuiyuanzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanzhuanquEntity> wrapper);
   	
}

