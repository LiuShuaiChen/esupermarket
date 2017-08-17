package com.bjpowernode.esupermarket.manager.service;

import java.util.List;

import com.bjpowernode.esupermarket.manager.domain.PaginationVO;
import com.bjpowernode.esupermarket.manager.domain.Product;
import com.bjpowernode.esupermarket.manager.domain.ProductCondition;

/**
 * @ClassName: ProductService
 * @Description: 商品业务逻辑实现接口
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午5:25:33
 */
public interface ProductService {

	/**
	 * 添加商品
	 * 
	 * @param product
	 */
	void insert(Product product);

	/**
	 * 删除商品
	 * 
	 * @param id
	 */
	void delete(Integer[] id);

	/**
	 * 更新商品
	 * 
	 * @param product
	 */
	void update(Product product);

	/**
	 * 根据 id 查询商品
	 * 
	 * @param id
	 * @return
	 */
	Product findById(Integer id);

	/**
	 * 根据 查询条件 返回结果
	 * 
	 * @param condition
	 * @return
	 */
	PaginationVO<Product> findByCon(ProductCondition condition);

}
