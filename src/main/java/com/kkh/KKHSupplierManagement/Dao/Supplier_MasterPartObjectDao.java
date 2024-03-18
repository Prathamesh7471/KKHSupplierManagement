package com.kkh.KKHSupplierManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPart;
import com.kkh.KKHSupplierManagement.resource.Supplier_MasterPartObject;


public interface Supplier_MasterPartObjectDao extends JpaRepository<Supplier_MasterPartObject,Long>  {

	
}
