package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Supplier_ContractDao;
import com.kkh.KKHSupplierManagement.resource.Supplier_Contract;
import com.kkh.KKHSupplierManagement.service.Supplier_Contract_Service;

@Service
public class Supplier_Contract_Serviceimpl implements Supplier_Contract_Service {

	@Autowired
	private Supplier_ContractDao supplier_contractDao;

	@Override
	public Supplier_Contract addSupplier_Contract(Supplier_Contract supplier_contract) {
		supplier_contractDao.save(supplier_contract);
		return supplier_contract;
	}

	@Override
	public List<Supplier_Contract> getSupplier_contracts() {
		return this.supplier_contractDao.findAll();
	}

	@Override
	public Supplier_Contract getSupplier_Contract(Long document_number) {

		return supplier_contractDao.getReferenceById(document_number);
	}

	@Override
	public Supplier_Contract updateSupplier_Contract(Supplier_Contract supplier_contract) {
		supplier_contractDao.save(supplier_contract);
		return supplier_contract;
	}

	@Override
	public HttpStatus deleteSupplier_Contract(Long parseLong) {
		if (supplier_contractDao.existsById(parseLong)) {
			Supplier_Contract supplier_contract = supplier_contractDao.getReferenceById(parseLong);
			supplier_contractDao.delete(supplier_contract);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}

	}
}
