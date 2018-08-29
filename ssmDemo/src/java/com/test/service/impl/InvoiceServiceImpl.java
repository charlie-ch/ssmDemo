package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Invoice;
import com.test.entity.Item;
import com.test.mapper.InvoiceMapper;
import com.test.service.InvoiceService;
import com.test.utils.Res;
/**
 * 订单主表 业务实现
 * @author Administrator
 *
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	private InvoiceMapper invoiceMapper;
	@Override
	public List<Invoice> getAllMain() {
	
		return	invoiceMapper. getAllMain();
	}
	/**
	 * 根据主表id，查询子表
	 */
	@Override
	public List<Item> getItemsById(Invoice invoice) {
		// TODO Auto-generated method stub
		return invoiceMapper.getItemsById( invoice);
	}
	
	@Override
	public Res insert(Invoice invoice) {
		// TODO Auto-generated method stub
		invoice.setTotal("0");
		int i =invoiceMapper.insert( invoice);
		if(i>0){
			return Res.ok();
		}
		return Res.error("新增失败");
	}

}
