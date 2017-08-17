package com.bjpowernode.esupermarket.manager.dao;

import com.bjpowernode.esupermarket.manager.domain.Order;

/**
 * @ClassName: OrderDao
 * @Description: 订单接口
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:32:33
 */
public interface OrderDao {

	void insert(Order order);
	
	void delete(Integer id);
	
	void update(Order order);
	
	Order findById(Integer id);
}
