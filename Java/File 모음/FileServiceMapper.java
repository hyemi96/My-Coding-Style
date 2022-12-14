package com.projectName.file.service.mapper;

import org.springframework.stereotype.Repository;

import com.projectName.file.model.FileVO;

@Repository("FileServiceMapper")
public interface FileServiceMapper {
	
	
	public void insertFile(FileVO fileVO)throws Exception;
	
	public int selectFileSeq(FileVO fileVO) throws Exception;

	public String selectFilePath(FileVO fileVO) throws Exception;
	
	public void fileDelete(FileVO fileVO) throws Exception;

}
