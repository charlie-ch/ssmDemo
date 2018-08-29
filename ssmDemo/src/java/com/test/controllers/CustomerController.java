package com.test.controllers;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;
import com.test.utils.Res;
/**
 * 客户控制层
 * @author Administrator 
 *
 */
@RestController
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("getAll")
	public Object getAll() {

		List<Customer> cs = customerService.getAll();
		return cs;
	}
	/**
	 * 保存
	 * @return
	 */
	@RequestMapping("saveCustomer")
	public Object saveCustomer(Customer customer) {
		
		Res res =customerService.saveCustomer(customer);
		return res;
	}
	/**
	 * 删除
	 * @return
	 */
	@RequestMapping("delete")
	public Object delete(Customer customer) {
		if(customer==null||StringUtils.isBlank(customer.getId())){
			return Res.error("id为空");
		}
		Res res =customerService.delete(customer);
		return res;
	}
	/**
	 * 查询无订单客户
	 * @return
	 */
	@RequestMapping("getAvailableCustomer")
	public Object getAvailableCustomer() {
		
		List<Customer> cs =customerService.getAvailableCustomer();
		return cs;
	}
}
