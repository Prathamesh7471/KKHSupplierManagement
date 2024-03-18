package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.Certification_of_InsuranceDao;
import com.kkh.KKHSupplierManagement.Dao.Compliance_CertificationDao;
import com.kkh.KKHSupplierManagement.resource.Certification_of_Insurance;
import com.kkh.KKHSupplierManagement.resource.Compliance_Certification;
import com.kkh.KKHSupplierManagement.service.Compliance_Certification_Service;

@Service
public class Compliance_Certification_Serviceimpl implements Compliance_Certification_Service {

	@Autowired
	private	Compliance_CertificationDao compliance_certificationDao;
	
	
	@Override
	public Compliance_Certification addCompliance_Certification(Compliance_Certification compliance_certification) {

		compliance_certificationDao.save(compliance_certification);
		return compliance_certification;
	}

	
	@Override
	public List<Compliance_Certification> getCompliance_Certifications() {

		return this.compliance_certificationDao.findAll();
	}

	@Override
	public Compliance_Certification getCompliance_Certification(Long certification_number) {

		return compliance_certificationDao.getReferenceById(certification_number);
	}

	@Override
	public Compliance_Certification updateCompliance_Certification(Compliance_Certification compliance_certification) {
		compliance_certificationDao.save(compliance_certification);
		return compliance_certification;
	}

	@Override
	public HttpStatus deleteCompliance_Certification(Long parseLong) {
		if(compliance_certificationDao.existsById(parseLong)) {
			Compliance_Certification Compliance_Certification1 = compliance_certificationDao.getReferenceById(parseLong);
			compliance_certificationDao.delete(Compliance_Certification1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

	
	
	
}
