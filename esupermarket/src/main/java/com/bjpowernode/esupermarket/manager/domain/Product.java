package com.bjpowernode.esupermarket.manager.domain;

/**
 * @ClassName: Product
 * @author: ShuaichenLau
 * @date: 2017年8月16日 下午5:14:29
 */
public class Product {

	private Integer id;// 主键

	private String productNo;// 编号

	private String title;// 标题

	private Double price;// 单价

	private String sellPoint;// 卖点

	/**
	 * 状态 0:未发布 1:已发布 2:失效
	 */
	private String status;

	private String image1;// 图片1

	private String image2;// 图片2

	private String image3;// 图片3

	private String image4;// 图片4

	private String image5;// 图片5

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productNo=" + productNo + ", title=" + title + ", price=" + price
				+ ", sellPoint=" + sellPoint + ", status=" + status + ", image1=" + image1 + ", image2=" + image2
				+ ", image3=" + image3 + ", image4=" + image4 + ", image5=" + image5 + "]";
	}
}
