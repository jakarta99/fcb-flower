package tw.com.fcb.flower.core.ir.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class IRServiceAspect {

	@Before(value="execution(* tw.com.fcb.flower.core.ir.service.*Service.*(..))")
	public void beforeServiceMethods(JoinPoint jp) {
		
		log.debug("before ***********************************");
		
		
		Object[] args = jp.getArgs();
		
		for(Object arg:args) {
			log.debug("arg = {}", arg);
		}
		
		log.debug("signature : {} ", jp.getSignature());
		
	}
	
	
	@After(value="execution(* tw.com.fcb.flower.core.ir.service.*Service.*(..))")
	public void afterServiceMethods() {
		log.debug("after ***********************************");
	}
	
}
