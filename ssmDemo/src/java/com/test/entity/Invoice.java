package com.test.entity;
/**
 * 订单主表
 * @author Administrator
 *
 */
public class Invoice {

	private String id;
	/**
	 * 客户id
	 */
	private String customerid;
	/**
	 * 客户名
	 */
	private String customerName;
	/**
	 * 总金额
	 */
	private String total;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	
	
}
