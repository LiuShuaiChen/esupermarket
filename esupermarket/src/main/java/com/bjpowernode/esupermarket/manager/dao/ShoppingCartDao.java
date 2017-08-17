package com.bjpowernode.esupermarket.manager.dao;

import com.bjpowernode.esupermarket.manager.domain.ShoppingCart;

/**
 * @ClassName: ShoppingCartDao
 * @Description: 购物车接口
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:15:38
 */
public interface ShoppingCartDao {

	void insert(ShoppingCart shoppingCart);

	void delete(Integer id);

	void update(ShoppingCart shoppingCart);

	ShoppingCart findById(Integer id);

}
