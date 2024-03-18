package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Certification_of_InsuranceDao;
import com.kkh.KKHSupplierManagement.Dao.InvoiceDao;
import com.kkh.KKHSupplierManagement.resource.Certification_of_Insurance;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.service.Certification_of_Insurance_Service;

@Service
public class Certification_of_Insurance_Serviceimpl implements Certification_of_Insurance_Service{

	@Autowired
	private	Certification_of_InsuranceDao certification_of_insuranceDao;
	
	@Override
	public Certification_of_Insurance addCertification_of_Insurance(
			Certification_of_Insurance certification_of_insurance) {

		certification_of_insuranceDao.save(certification_of_insurance);
		return certification_of_insurance;
	}

	@Override
	public List<Certification_of_Insurance> getCertification_of_Insurances() {

		return this.certification_of_insuranceDao.findAll();
	}

	@Override
	public Certification_of_Insurance getCertification_of_Insurance(Long Policy_Number) {

		
		return certification_of_insuranceDao.getReferenceById(Policy_Number);
	}

	@Override
	public Certification_of_Insurance updateCertification_of_Insurance(
			Certification_of_Insurance certification_of_insurance) {
		certification_of_insuranceDao.save(certification_of_insurance);
		return certification_of_insurance;
	}

	@Override
	public HttpStatus deleteCertification_of_Insurance(Long parseLong) {
		if(certification_of_insuranceDao.existsById(parseLong)) {
			Certification_of_Insurance Certification_of_Insurance1 = certification_of_insuranceDao.getReferenceById(parseLong);
			certification_of_insuranceDao.delete(Certification_of_Insurance1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
