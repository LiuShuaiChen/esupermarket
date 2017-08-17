package com.bjpowernode.esupermarket.manager.dao;

import java.util.List;

import com.bjpowernode.esupermarket.manager.domain.Product;
import com.bjpowernode.esupermarket.manager.domain.ProductCondition;

/**
 * 商品接口
 * @ClassName: ProductDao
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午5:45:18
 */
public interface ProductDao {
	
	/**
	 * 添加商品
	 * @param product
	 */
	void insert(Product product);
	
	/**
	 * 删除商品
	 * @param id
	 */
	void delete(Integer id);
	
	/**
	 * 更新商品
	 * @param product
	 */
	void update(Product product);
	
	/**
	 * 根据 id 查询商品
	 * @param id
	 * @return
	 */
	Product findById(Integer id);
	
	/**
	 * 根据 查询条件 返回结果
	 * @param condition
	 * @return
	 */
	List<Product> findByCon(ProductCondition condition);
	/**
	 * 根据 查询条件 返回记录数
	 * @param condition
	 * @return
	 */
	Long getTotal(ProductCondition condition);
}
