package com.bjpowernode.esupermarket.manager.domain;

import java.util.List;

/**
 * @ClassName: PaginationVO
 * @Description: 分页对象 模型
 * @author: ShuaichenLau
 * @date: 2017年8月17日 下午5:35:44
 * @param <T>
 */
public class PaginationVO<T> {

	/**
	 * @fieldName: total
	 * @fieldType: Long
	 * @Description: 查询总记录数
	 */
	private Long total;

	/**
	 * @fieldName: dataList
	 * @fieldType: List<T>
	 * @Description: 总记录数据
	 */
	private List<T> dataList;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
}
