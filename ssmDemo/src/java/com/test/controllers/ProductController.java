package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Product;
import com.test.service.ProductService;
import com.test.utils.Res;
/**
 * 产品控制层
 * @author Administrator
 *
 */
@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService productService;
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("getAll")
	public Object getAll(){
		List<Product> ps =productService.getAll();
		return ps;
	}
	/**
	 * 保存
	 * @return
	 */
	@RequestMapping("saveProduct")
	public Object saveProduct(Product product){
		Res res =productService.saveProduct(product);
		return res;
	}
	/**
	 * 删除
	 * @return
	 */
	@RequestMapping("delete")
	public Object delete(Product product){
		Res res =productService.delete(product);
		return res;
	}
}
