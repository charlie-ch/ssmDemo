package com.test.service;

import java.util.List;

import com.test.entity.Product;
import com.test.utils.Res;

/**
 * 产品业务层接口
 * @author Administrator
 *
 */
public interface ProductService {

	/**
	 * 查所有
	 * @return
	 */
	List<Product> getAll();

	/**
	 * 保存
	 * @param product 
	 * @return
	 */
	Res saveProduct(Product product);

	/**
	 * 删除
	 * @param product
	 * @return
	 */
	Res delete(Product product);

}
