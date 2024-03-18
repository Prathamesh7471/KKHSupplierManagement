package com.kkh.KKHSupplierManagement.serviceImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.kkh.KKHSupplierManagement.Dao.KKHSupplierDocumentDao;
import com.kkh.KKHSupplierManagement.resource.KKHSupplierDocument;
import com.kkh.KKHSupplierManagement.service.KKHFileUploadDownloadService;


@Service
public class KKHFileUploadDownloadServiceImpl implements KKHFileUploadDownloadService{

	@Autowired
	KKHSupplierDocumentDao kkhSupplierDocumentDao;
	
	
	public KKHSupplierDocument storeFile(MultipartFile file) throws Exception {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if (fileName.contains("..")) {
                throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
            }

            KKHSupplierDocument dbFile = new KKHSupplierDocument(null, fileName, file.getContentType(), file.getBytes(), fileName, fileName, fileName, fileName, fileName, fileName, fileName, fileName, fileName, fileName, fileName);

            return kkhSupplierDocumentDao.save(dbFile);
        } catch (IOException ex) {
            throw new Exception("Could not store file " + fileName + ". Please try again!", ex);
        }
    }
	
	@Override
	public KKHSupplierDocument getFile(Long fileId) throws Exception {
		
		return kkhSupplierDocumentDao.findById(fileId).orElseThrow(() -> new Exception("File not found with id " + fileId));
        //return kkhSupplierDocumentDao.findById(fileId).orElseThrow(() -> new Exception("File not found with id " + fileId));
    }
}
