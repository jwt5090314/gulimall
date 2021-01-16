package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wentao
 * @email wentao@gmail.com
 * @date 2021-01-12 01:08:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
