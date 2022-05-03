package tw.com.fcb.flower.core.threads;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MultithreadService {

	@Async("myExecutor")
	public CompletableFuture<String> task1(String requestId) throws InterruptedException {
		Thread.sleep(1000L);
		log.info("request id : {}", requestId);
		return CompletableFuture.completedFuture("Done");
	}
	
	@Async("myExecutor")
	public CompletableFuture<String> task2(String requestId) throws InterruptedException {
		Thread.sleep(1000L);
		log.info("request id : {}", requestId);
		return CompletableFuture.completedFuture("Done");
	}
	
	
	
}
