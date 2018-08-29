package com.test.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.entity.Invoice;
import com.test.entity.Item;

/**
 * 订单主表 映射
 * @author Administrator
 *
 */
@Repository
public interface InvoiceMapper {

	List<Invoice> getAllMain();

	List<Item> getItemsById(Invoice invoice);

	int insert(Invoice invoice);

}
