package com.bjpowernode.esupermarket.manager.dao;

import com.bjpowernode.esupermarket.manager.domain.ReceiveAddress;

/**
 * @ClassName: ReceiveAddressDao
 * @Description: 接收地址业务接口
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午4:26:12
 */
public interface ReceiveAddressDao {

	void insert(ReceiveAddress receiveAddress);
	
	void delete(Integer id);
	
	void update(ReceiveAddress receiveAddress);
	
	ReceiveAddress findById(Integer id);
	
	
}
