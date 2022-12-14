package com.projectName.file.service.impl;

import org.springframework.stereotype.Service;

import com.projectName.file.model.FileVO;
import com.projectName.file.service.FileService;
import com.projectName.group.service.impl.GroupServiceDAO;

import javax.annotation.Resource;

import org.apache.log4j.Logger;


@Service("FileService")
public class FileServiceImpl implements FileService{
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name="FileServiceDAO")
	private FileServiceDAO fileServiceDAO;
	
	@Override 
	public void insertFile(FileVO fileVO) throws Exception {
		fileServiceDAO.insertFile(fileVO); 
	} 
	public int selectFileSeq(FileVO fileVO) throws Exception { 
		return fileServiceDAO.selectFileSeq(fileVO); 
	}
	public String selectFilePath(FileVO fileVO) throws Exception { 
		return (String)fileServiceDAO.selectFilePath(fileVO); 
	}
	@Override 
	public void fileDelete(FileVO fileVO) throws Exception {
	fileServiceDAO.fileDelete(fileVO); 
	}

}
