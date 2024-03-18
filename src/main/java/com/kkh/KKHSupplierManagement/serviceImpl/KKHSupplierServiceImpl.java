package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.SupplierDao;
import com.kkh.KKHSupplierManagement.Dao.Supplier_ContractDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.service.KKHSupplierService;



@Service
public class KKHSupplierServiceImpl implements KKHSupplierService{

	@Autowired
	private	SupplierDao supplierDao;
	

	
	//kkhsupplier
	@Override
	public KKHSupplier addSupplierDetails(KKHSupplier kkhSupplierBean) {

		supplierDao.save(kkhSupplierBean);
		return kkhSupplierBean;
	}
	@Override
	public List<KKHSupplier> getSuppliers() {
		// TODO Auto-generated method stub
		return this.supplierDao.findAll();
	}
	
	@Override
	public KKHSupplier getSupplier(Long supplierId) {

		System.out.println("in doa method");
		return supplierDao.getReferenceById(supplierId);
	}
	@Override
	public KKHSupplier updateSupplier(KKHSupplier kkhSupplierBean) {
		
		supplierDao.save(kkhSupplierBean);
	
		return kkhSupplierBean;
		
	}
	@Override
	public HttpStatus deleteSupplier(Long parseLong) {
		
		if(supplierDao.existsById(parseLong)) {
			KKHSupplier supplierBean = supplierDao.getReferenceById(parseLong);
			supplierDao.delete(supplierBean);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
		
		
	}
	@Override
	public List<KKHSupplier> getSupplierCategory(String category) {

		return supplierDao.findByCategory(category);
	}
	
	
	



	
	

	
	
}
