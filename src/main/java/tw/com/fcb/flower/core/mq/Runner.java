package tw.com.fcb.flower.core.mq;

import java.util.concurrent.TimeUnit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import tw.com.fcb.flower.core.FcbCoreApplication;

@Component
public class Runner implements CommandLineRunner {

	RabbitTemplate rabbitTemplate;
	Receiver receiver;
	
	public Runner(Receiver receiver, RabbitTemplate rabbitTemplate) {
		this.receiver = receiver;
		this.rabbitTemplate = rabbitTemplate;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("==========sending a message to MQ===========");
		rabbitTemplate.convertAndSend(FcbCoreApplication.topic, "fcb.flower.sample", "hello this is a new message from gary");
		receiver.getLatch().await(1000, TimeUnit.SECONDS);
		
		
	}

}
