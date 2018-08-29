package com.test.service;

import java.util.List;

import com.test.entity.Customer;
import com.test.utils.Res;

/**
 * 客户业务层接口
 * @author Administrator
 *
 */
public interface CustomerService {

	List<Customer> getAll();

	/**
	 * 保存
	 * @param customer
	 * @return
	 */
	Res saveCustomer(Customer customer);

	/**
	 * 删除
	 * @param customer
	 * @return
	 */
	Res delete(Customer customer);
	/**
	 * 查询无订单客户
	 * @return
	 */
	List<Customer> getAvailableCustomer();

}
