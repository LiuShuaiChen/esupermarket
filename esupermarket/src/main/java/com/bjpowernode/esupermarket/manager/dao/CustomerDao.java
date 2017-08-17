package com.bjpowernode.esupermarket.manager.dao;

import com.bjpowernode.esupermarket.manager.domain.Customer;

/**
 * 用户接口
 * @ClassName: CustomerDao
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午5:44:56
 */
public interface CustomerDao {

	void insert(Customer customer);

	void delete(Integer id);

	void update(Customer customer);

	Customer findById(Integer id);
}
