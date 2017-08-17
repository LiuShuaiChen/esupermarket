package com.bjpowernode.esupermarket.manager.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bjpowernode.esupermarket.manager.domain.PaginationVO;
import com.bjpowernode.esupermarket.manager.domain.Product;
import com.bjpowernode.esupermarket.manager.domain.ProductCondition;
import com.bjpowernode.esupermarket.manager.service.ProductService;

/**
 * @ClassName: ProductServiceImplTest
 * @Description: 商品对象测试类
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午5:46:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/application-dao.xml","classpath:spring/application-service.xml","classpath:spring/application-trans.xml"})
public class ProductServiceImplTest {

	@Autowired
	private ProductService service;
	
	@Test
	public void testInsert() {
		for (int i = 0; i < 10; i++) {
			Product product = new Product();
			product.setProductNo("helloworld" + i);
			product.setTitle("nokia" + i);
			product.setStatus("0");
			product.setSellPoint("hello" + i);
			product.setPrice(Double.valueOf(i));
			product.setImage1("image1" + i);
			product.setImage2("image2" + i);
			product.setImage3("image3" + i);
			product.setImage4("image4" + i);
			product.setImage5("image5" + i);
			service.insert(product);
		}
	}

	@Test
	public void testDelete() {
		Integer [] ids = {153,154};
		service.delete(ids);
	}

	@Test
	public void testUpdate() {
		Product product = new Product();
		product.setProductNo("helloworld123");
		product.setTitle("nokia123");
		product.setStatus("1");
		product.setSellPoint("hello123");
		product.setPrice(1299.0);
		product.setImage1("image15");
		product.setImage2("image25");
		product.setImage3("image35");
		product.setImage4("image45");
		product.setImage5("image55");
		product.setId(151);
		service.update(product);
	}

	@Test
	public void testFindById() {
		Product product = service.findById(151);
		System.out.println(product);
	}

	@Test
	public void testFindByCon() {
		ProductCondition condition = new ProductCondition();
		condition.setPageNo(1);
		condition.setPageSize(5);
		PaginationVO<Product> vo = service.findByCon(condition);
		System.out.println(vo.getTotal());
		System.out.println(vo.getDataList().size());
		System.out.println(vo.getDataList());
	}

}
