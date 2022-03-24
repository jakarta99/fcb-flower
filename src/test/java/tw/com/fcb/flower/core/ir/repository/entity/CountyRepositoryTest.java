package tw.com.fcb.flower.core.ir.repository.entity;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Transactional
@Slf4j
@SpringBootTest
class CountyRepositoryTest {

	@Autowired
	CountyRepository countyRepository;
	
	
	@Test
	void testFindById() {

		County county = countyRepository.findById(1L).orElseThrow(()->new RuntimeException("not found"));
		
		System.out.println(county);
		
		System.out.println("xxxxxxxxxxxxxxxxxxxx");
		
		System.out.println(county.getDistricts());
		
	}

}
