package com.bjpowernode.esupermarket.manager.domain;

/**
 * 用户实体对象
 * 
 * @ClassName: Customer
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午5:40:47
 */
public class Customer {

	private Integer id; // 主键
	private String customerNo;// 编号
	private String nickname;// 昵称
	private String phone;// 电话
	private String password;// 密码 使用MD5
	private String createTime;// 用户注册时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
