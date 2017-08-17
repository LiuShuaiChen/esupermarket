package com.bjpowernode.esupermarket.manager.domain;

/**
 * @ClassName: Order
 * @Description: 订单对象实体类
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:30:06
 */
public class Order {

	private Integer id;// 主键

	private String orderNo;// 订单编号

	private Integer receiveId;// 收货地址标识

	private String orderTime;// 订单时间
	/**
	 * 订单状态 待支付：0，已支付：1
	 */
	private String status;

	private Integer customerId;// 用户标识

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Integer getReceiveId() {
		return receiveId;
	}

	public void setReceiveId(Integer receiveId) {
		this.receiveId = receiveId;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

}
