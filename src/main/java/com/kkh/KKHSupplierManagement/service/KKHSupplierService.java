package com.kkh.KKHSupplierManagement.service;





import java.util.List;

import org.springframework.http.HttpStatus;

import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;



public interface KKHSupplierService {

	
	public KKHSupplier addSupplierDetails(KKHSupplier kkhSupplierBean);
	
	public List<KKHSupplier> getSuppliers();
	
 	public KKHSupplier  getSupplier(Long supplierId);
 	
 	public KKHSupplier updateSupplier(KKHSupplier kkhSupplierBean);
 	
	public HttpStatus deleteSupplier(Long parseLong);

	public List<KKHSupplier>  getSupplierCategory(String category);
	
	
}

