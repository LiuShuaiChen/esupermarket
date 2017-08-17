package com.bjpowernode.esupermarket.manager.domain;

/**
 * @ClassName: ReceiveAddress
 * @Description: 用户接收地址
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午7:18:13
 */
public class ReceiveAddress {

	private Integer id;// 主键

	private String name;// 收货人名字

	private String phone;// 收货人手机号码

	private String address;// 收货地址

	/**
	 * 默认地址状态 1:默认收货地址 0:不是默认地址
	 */
	private String status;

	private Integer customerId;// 用户标识

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
