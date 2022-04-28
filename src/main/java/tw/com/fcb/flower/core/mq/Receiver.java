package tw.com.fcb.flower.core.mq;

import java.util.concurrent.CountDownLatch;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Receiver {

	CountDownLatch latch = new CountDownLatch(1);
	
	public void receiveMessage(String message) {
		log.debug("{}", message);
		latch.countDown();
	}
	
	
	public CountDownLatch getLatch() {
		return latch;
	}
	
	
}
