package com.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Invoice;
import com.test.entity.Item;
import com.test.service.InvoiceService;
import com.test.utils.Res;
/**
 * 订单控制层
 * @author Administrator
 *
 */
@RestController
@RequestMapping("order")
public class OrderContoller {

	@Autowired
	private InvoiceService invoiceService;
	
	/**
	 * 查询所有主表
	 */
	@RequestMapping("getAllMain")
	public Object getAllMain(){
		
		List<Invoice> is = invoiceService.getAllMain();
		return is;
	}
	/**
	 * 查询所有主表
	 */
	@RequestMapping("getItemsById")
	public Object getItemsById(Invoice invoice){
		
		List<Item> is = invoiceService.getItemsById(invoice);
		return is;
	}
	/**
	 * 保存主表
	 */
	@RequestMapping("saveInvoice")
	public Object saveInvoice(Invoice invoice){
		
		Res res  = invoiceService.insert(invoice);
		return res ;
	}
}
