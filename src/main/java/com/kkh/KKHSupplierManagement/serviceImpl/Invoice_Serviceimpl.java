package com.kkh.KKHSupplierManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kkh.KKHSupplierManagement.Dao.InvoiceDao;
import com.kkh.KKHSupplierManagement.Dao.SupplierDao;
import com.kkh.KKHSupplierManagement.resource.Invoice;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;
import com.kkh.KKHSupplierManagement.service.Invoice_Service;

@Service
public class Invoice_Serviceimpl implements Invoice_Service{

	@Autowired
	private	InvoiceDao invoiceDao;
	
	@Override
	public Invoice addInvoice(Invoice invoice) {

		invoiceDao.save(invoice);
		return invoice;
	}

	@Override
	public List<Invoice> getInvoices() {

		return this.invoiceDao.findAll();
	}

	@Override
	public Invoice getInvoice(Long invoice_number) {
		
		return invoiceDao.getReferenceById(invoice_number);
	}

	@Override
	public Invoice updateInvoice(Invoice invoice) {
		
	invoiceDao.save(invoice);
		
		return invoice;
	}


	@Override
	public HttpStatus deleteInvoice(Long parseLong) {
		if(invoiceDao.existsById(parseLong)) {
			Invoice invoice1 = invoiceDao.getReferenceById(parseLong);
			invoiceDao.delete(invoice1);
			return HttpStatus.OK;
		}else {
			return HttpStatus.NOT_FOUND;
		}
	}

}
