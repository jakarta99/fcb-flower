package tw.com.fcb.flower.core;

import java.util.concurrent.Executor;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import tw.com.fcb.flower.core.mq.Receiver;


@EnableAsync
@SpringBootApplication
public class FcbCoreApplication {

	public static final String topic = "fcb-flower-news";
	public static final String queue = "fcb-flower";

	public static void main(String[] args) {
		SpringApplication.run(FcbCoreApplication.class, args);
	}

	@Bean
	Queue queue() {
		return new Queue(queue, false);
	}

	@Bean
	TopicExchange exchange() {
		return new TopicExchange(topic);
	}

	@Bean
	Binding binding(Queue queue, TopicExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("fcb.flower.#");
	}

	@Bean
	SimpleMessageListenerContainer container(ConnectionFactory connectionFactory,
			MessageListenerAdapter listenerAdapter) {

		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setConnectionFactory(connectionFactory);
		container.setQueueNames(queue);
		container.setMessageListener(listenerAdapter);

		return container;
	}

	@Bean
	MessageListenerAdapter listenerAdapter(Receiver receiver) {
		return new MessageListenerAdapter(receiver, "receiveMessage");
	}
	
	
	@Bean("myExecutor")
	public Executor myExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);
		executor.setMaxPoolSize(10);
		executor.setQueueCapacity(200);
		executor.setKeepAliveSeconds(60);
		executor.initialize();
		return executor;
	}
	
	@Bean("myExecutor2")
	public Executor myExecutor2() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);
		executor.setMaxPoolSize(10);
		executor.setQueueCapacity(200);
		executor.setKeepAliveSeconds(60);
		executor.initialize();
		return executor;
	}
}
