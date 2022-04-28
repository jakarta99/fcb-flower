package tw.com.fcb.flower.core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.com.fcb.flower.core.commons.enums.Sex;

@RestController
public class DemoController {
	
	@GetMapping("/init")
	public void initData() {
		
		//read csv
		String sex = "MALE";
		
		Sex mySex = Sex.valueOf(sex);
		
		
		
	}
	
	
	@GetMapping("/insert-swift")
	public String insertSwift() {
		//test
		return "insert ok";
	}
	

}
