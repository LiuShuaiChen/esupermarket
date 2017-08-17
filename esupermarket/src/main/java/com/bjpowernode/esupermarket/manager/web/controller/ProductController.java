package com.bjpowernode.esupermarket.manager.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台商品controller层
 * 
 * @ClassName: ProductController
 * @author: ShuaichenLau
 * @date: 2017年8月16日 上午11:56:57
 */
@RequestMapping("/product")
@Controller
public class ProductController {

	@RequestMapping("/index")
	public String index() {
		return "manager/product/index";
	}

	@RequestMapping("/saveProduct")
	public String add() {
		return "manager/product/saveProduct";
	}

	@RequestMapping("/detail")
	public String detail() {
		return "manager/product/detail";
	}

	@RequestMapping("/editProduct")
	public String edit() {
		return "manager/product/editProduct";
	}

}
