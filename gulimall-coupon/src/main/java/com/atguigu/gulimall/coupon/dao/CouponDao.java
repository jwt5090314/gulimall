package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wentao
 * @email wentao@gmail.com
 * @date 2021-01-12 00:52:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
