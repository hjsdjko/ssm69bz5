package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuiyuanzhuanquEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuiyuanzhuanquVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuiyuanzhuanquView;


/**
 * 会员专区评论表
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:55:59
 */
public interface DiscusshuiyuanzhuanquService extends IService<DiscusshuiyuanzhuanquEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuiyuanzhuanquVO> selectListVO(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
   	
   	DiscusshuiyuanzhuanquVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
   	
   	List<DiscusshuiyuanzhuanquView> selectListView(Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
   	
   	DiscusshuiyuanzhuanquView selectView(@Param("ew") Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuiyuanzhuanquEntity> wrapper);
   	
}

