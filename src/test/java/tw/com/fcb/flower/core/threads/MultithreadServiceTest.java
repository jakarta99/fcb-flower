package tw.com.fcb.flower.core.threads;

import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class MultithreadServiceTest {
	
	@Autowired
	MultithreadService servie; 

	@Test
	void testMultithreads() {
		long startTime = System.currentTimeMillis();
		
		try {
			CompletableFuture<String> task1_1 = servie.task1("1-100");
			CompletableFuture<String> task2_1 = servie.task2("101-200");
			CompletableFuture<String> task1_2 = servie.task1("201-300");
			CompletableFuture<String> task2_2 = servie.task2("301-400");
			
			CompletableFuture.allOf(task1_1, task2_1, task1_2, task2_2).join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long endTime = System.currentTimeMillis();
		
		log.info("execute : {} ms", (endTime - startTime));
		
	}

}
