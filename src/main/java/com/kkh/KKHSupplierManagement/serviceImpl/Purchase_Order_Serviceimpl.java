package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Purchase_OrderDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_ContractDao;
import com.kkh.KKHSupplierManagement.resource.Purchase_Order;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.service.Purchase_Order_Service;

@Service
public class Purchase_Order_Serviceimpl implements Purchase_Order_Service{

	
	@Autowired
	private Purchase_OrderDao purchase_orderDao;
	
	@Override
	public Purchase_Order addPurchase_Order(Purchase_Order purchase_order) {
		purchase_orderDao.save(purchase_order)	;
		return purchase_order;
	}

	
	@Override
	public List<Purchase_Order> getPurchase_Orders() {
		return this.purchase_orderDao.findAll();
	}

	@Override
	public Purchase_Order getPurchase_Order(Long Purchase_Order_Number) {
		  return purchase_orderDao.getReferenceById(Purchase_Order_Number);
	}

	@Override
	public Purchase_Order updatePurchase_Order(Purchase_Order purchase_order) {
		purchase_orderDao.save(purchase_order);
      	return purchase_order;
	}

	@Override
	public HttpStatus deletePurchase_Order(Long parseLong) {
		if(purchase_orderDao.existsById(parseLong)) {
			Purchase_Order purchase_order = purchase_orderDao.getReferenceById(parseLong);
			purchase_orderDao.delete(purchase_order);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
