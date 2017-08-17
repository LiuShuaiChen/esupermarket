package com.bjpowernode.esupermarket.manager.domain;

/**
 * @ClassName: ProductCondition
 * @Description: 商品查询条件对象 VO
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午4:58:23
 */
public class ProductCondition {

	private String productNo;// 商品编号

	private String title;// 商品标题

	private Double price;// 商品单价

	private String sellPoint;// 商品卖点信息

	private String status;// 商品状态

	private Integer pageNo;// 页码

	private Integer pageSize;// 每页显示记录数

	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPageNo() {
		return (pageNo - 1) * pageSize;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

}
