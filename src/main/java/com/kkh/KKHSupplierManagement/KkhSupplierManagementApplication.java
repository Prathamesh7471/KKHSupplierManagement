package com.kkh.KKHSupplierManagement;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kkh.KKHSupplierManagement.Dao.SupplierDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplier;

@SpringBootApplication
public class KkhSupplierManagementApplication {

	public static void main(String[]
 args) {
		SpringApplication.run(KkhSupplierManagementApplication.class, args);
		System.out.println();
		
//		 ConfigurableApplicationContext context = SpringApplication.run(KkhSupplierManagementApplication.class, args);
//		SupplierDao supplierDao = context.getBean(SupplierDao.class);
//		
//	List<KKHSupplier> user =	supplierDao.findByCategory("Manufacturer");
//	//	user.forEach(e-> System.out.println(e));
}}
  