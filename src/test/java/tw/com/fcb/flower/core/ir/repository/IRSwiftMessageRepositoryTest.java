package tw.com.fcb.flower.core.ir.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tw.com.fcb.flower.core.ir.repository.entity.IRSwiftMessage;

@Transactional
@SpringBootTest
class IRSwiftMessageRepositoryTest {
	
	@Autowired
	IRSwiftMessageRepository repository;

	@Test
	void testFindById() {
		//IRSwiftMessage message = repository.findById(2L).get();
		
		IRSwiftMessage message = repository.findById(2L).orElse(new IRSwiftMessage());
		
		
		System.out.println(message);
		//assertEquals(message.getAmount(), 1);
	}
	
	@Test
	void testFindBySeqNo() {
		IRSwiftMessage message = repository.findBySeqNo("123456789012345").orElse(new IRSwiftMessage());
		
		assertEquals(new BigDecimal("2000"), message.getAmount());
	}
	
	@Test
	void testFindBySeqNoLike() {
		List<IRSwiftMessage> messages = repository.findBySeqNoLike("1234567890%");
		
		assertEquals(3, messages.size());
	}
	
	

//	@Test
//	void testGetById() {
//		// 不建議使用 getById
//		IRSwiftMessage message = repository.getById(2L);
//		System.out.println(message);
//		//assertEquals(message.getAmount(), 1);
//	}

}
