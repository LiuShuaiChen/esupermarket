package com.bjpowernode.esupermarket.manager.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjpowernode.esupermarket.manager.dao.ProductDao;
import com.bjpowernode.esupermarket.manager.domain.PaginationVO;
import com.bjpowernode.esupermarket.manager.domain.Product;
import com.bjpowernode.esupermarket.manager.domain.ProductCondition;
import com.bjpowernode.esupermarket.manager.service.ProductService;

/**
 * @ClassName: ProductServiceImpl
 * @Description: 商品业务逻辑接口实现类
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午5:26:09
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Override
	public void insert(Product product) {
		dao.insert(product);
	}

	@Override
	public void delete(Integer[] ids) {
		for (Integer id : ids) {
			dao.delete(id);
		}
	}

	@Override
	public void update(Product product) {
		dao.update(product);
	}

	@Override
	public Product findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public PaginationVO<Product> findByCon(ProductCondition condition) {
		// 创建分页模型对象
		PaginationVO<Product> paginationVO = new PaginationVO<>();
		paginationVO.setTotal(dao.getTotal(condition));
		paginationVO.setDataList(dao.findByCon(condition));
		return paginationVO;
	}

}
