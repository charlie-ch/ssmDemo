package com.test.service;

import java.util.List;

import com.test.entity.Invoice;
import com.test.entity.Item;
import com.test.utils.Res;

/**
 * 订单主表业务
 * @author Administrator
 *
 */
public interface InvoiceService {

	List<Invoice> getAllMain();

	List<Item> getItemsById(Invoice invoice);

	Res insert(Invoice invoice);

}
