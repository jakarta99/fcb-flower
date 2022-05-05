package tw.com.fcb.flower.core.ir.service;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileServiceTest {
	
	@Autowired
	FileService fileService;

	@Test
	void testSaveSwift() {
		fileService.saveSwift("xxxx");
		
		fileService.getSwiftByCode("A001");;
	}

}
