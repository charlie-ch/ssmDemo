package com.test.entity;
/**
 * 产品
 * @author Administrator
 *
 */
public class Product {

	
	private String id;
	/**
	 * 产品名称
	 */
	private String name;
	/**
	 * 价格
	 */
	private String price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
