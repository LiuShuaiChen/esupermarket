package com.bjpowernode.esupermarket.manager.dao;

import com.bjpowernode.esupermarket.manager.domain.OrderDetail;

/**
 * 用户接口
 * 
 * @ClassName: CustomerDao
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午5:44:56
 */
public interface OrderDetailDao {

	void insert(OrderDetail orderDetail);

	void delete(Integer id);

	void update(OrderDetail orderDetail);

	OrderDetail findById(Integer id);
}
