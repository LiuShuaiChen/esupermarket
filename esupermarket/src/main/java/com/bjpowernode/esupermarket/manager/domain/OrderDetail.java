package com.bjpowernode.esupermarket.manager.domain;

/**
 * @ClassName: OrderDetail
 * @Description: 订单信息明细表
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:35:12
 */
public class OrderDetail {

	private Integer id;// 主键
	private Integer productId;// 商品标识
	private Integer purchaseCount;// 购物商品数量
	private Integer orderId;// 订单主表标识

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
