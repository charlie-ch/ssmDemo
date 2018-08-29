package com.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.entity.Customer;
/**
 * 客户映射接口
 * @author Administrator
 *
 */
@Repository
public interface CustomerMapper {

	List<Customer> getAll();

	/**
	 * 根据客户名查询
	 * @param customer
	 * @return
	 */
	Customer getByCname(Customer customer);

	/**
	 * 新增
	 * @param customer
	 * @return
	 */
	int insert(Customer customer);

	/**
	 * 查询订单主表中客户订单个数
	 * @param customer
	 * @return
	 */
	int hasUsedInOrder(Customer customer);

	/**
	 * 删除客户信息
	 * @param customer
	 * @return
	 */
	int delete(Customer customer);

	/**
	 * 查询无订单客户
	 * @return
	 */
	List<Customer> getAvailableCustomer();

}
