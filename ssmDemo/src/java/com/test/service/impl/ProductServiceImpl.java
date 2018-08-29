package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Customer;
import com.test.entity.Product;
import com.test.mapper.ProductMappper;
import com.test.service.ProductService;
import com.test.utils.Res;

/**
 * 产品业务实现类
 * 
 * @author Administrator
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductMappper productMapper;

	/**
	 * 查询所有
	 */
	@Override
	public List<Product> getAll() {

		return productMapper.getAll();
	}

	/**
	 * 保存
	 */
	@Override
	public Res saveProduct(Product product) {
		Product p = productMapper.getByName(product);
		if (p != null) {
			return Res.error("产品名重复");// 客户名重复
		}
		int i = productMapper.insert(product);
		if (i > 0) {
			return Res.ok();
		} else {
			return Res.error("保存失败");
		}
	}

	/***
	 * 删除
	 */
	@Override
	public Res delete(Product product) {
		// 执行删除功能时，需要检测在请订单主表中是否已被使用，如被使用的话则不可删除
		int i = productMapper.hasUsedInOrder(product);
		if (i > 0) {
			return Res.error("该产品尚有订单，不可删除");
		}
		int j = productMapper.delete(product);
		if (j > 0) {
			return Res.ok();
		}
		return Res.error("删除失败");
	}

}
