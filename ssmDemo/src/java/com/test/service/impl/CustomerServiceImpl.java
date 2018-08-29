package com.test.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;
import com.test.mapper.CustomerMapper;
import com.test.service.CustomerService;
import com.test.utils.Res;
/**
 * 客户业务实现类
 * @author Administrator
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<Customer> getAll() {
		return customerMapper.getAll();
		
	}

	/**
	 * 保存
	 */
	@Override
	public Res saveCustomer(Customer customer) {
		Customer c =customerMapper.getByCname(customer);
		if(c!=null){
			return Res.error("客户名重复");//客户名重复
		}
		int i =customerMapper.insert(customer);
		if(i>0){
			return Res.ok();
		}else{
			return Res.error("保存失败");
		}
		
	}

	/**
	 * 删除
	 */
	@Override
	public Res delete(Customer customer) {
		//执行删除功能时，需要检测在请订单主表中是否已被使用，如被使用的话则不可删除
		int i =customerMapper.hasUsedInOrder(customer);
		if(i>0){
			return Res.error("该客户尚有订单，不可删除");
		}
		int j  = customerMapper.delete(customer);
		if(j>0){
			return Res.ok();
		}
		return Res.error("删除失败");
	}
	/**
	 * 查询无订单客户
	 * @return
	 */
	@Override
	public List<Customer> getAvailableCustomer() {
		// TODO Auto-generated method stub
		return customerMapper.getAvailableCustomer();
	}

}
