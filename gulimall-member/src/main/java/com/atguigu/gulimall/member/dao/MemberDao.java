package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wentao
 * @email wentao@gmail.com
 * @date 2021-01-12 01:01:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
