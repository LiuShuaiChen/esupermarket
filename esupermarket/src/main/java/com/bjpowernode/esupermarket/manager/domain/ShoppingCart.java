package com.bjpowernode.esupermarket.manager.domain;

/**
 * 购物车实体类
 * @ClassName: ShoppingCart
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:11:21
 */
public class ShoppingCart {

	private Integer id;// 主键
	private Integer customerId;// 用户标识
	private Integer productId;// 商品标识
	private Integer purchaseCount;// 商品购物数量
	private String status;// 商品下单状态

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getPurchaseCount() {
		return purchaseCount;
	}

	public void setPurchaseCount(Integer purchaseCount) {
		this.purchaseCount = purchaseCount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
