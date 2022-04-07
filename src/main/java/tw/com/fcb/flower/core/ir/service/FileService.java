package tw.com.fcb.flower.core.ir.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FileService {
	
	// SpEL
	@Value("${fcb.flower.core.ir.swift.file-path:c:\\fcb\\core\\dolala }") 
	String filePath;
	
	public void saveSwift(String swiftData) {
		
		File file = new File("abc.txt");
		
		log.debug("filePath = {}", filePath);
		
		// FileUtils.save(file, filePath);
	}

}
