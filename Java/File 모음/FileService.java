package com.projectName.file.service;

import java.util.List;

import com.projectName.file.model.FileVO;

public interface FileService {
	
	public void insertFile(FileVO fileVO)throws Exception;
	
	public int selectFileSeq(FileVO fileVO) throws Exception;

	public String selectFilePath(FileVO fileVO) throws Exception;
	
	public void fileDelete(FileVO fileVO) throws Exception;


}
