package com.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.entity.Product;
/**
 * 产品 映射
 * @author Administrator
 *
 */
@Repository
public interface ProductMappper {

	/**
	 * 查询所有
	 * @return
	 */
	List<Product> getAll();

	/**
	 * 根据名字查询
	 * @param product
	 * @return
	 */
	Product getByName(Product product);

	/**
	 * 新增
	 * @param product
	 * @return
	 */
	int insert(Product product);

	/**
	 * 查询产品订单个数
	 * @param product
	 * @return
	 */
	int hasUsedInOrder(Product product);

	/**
	 * 删除
	 * @param product
	 * @return
	 */
	int delete(Product product);

}
