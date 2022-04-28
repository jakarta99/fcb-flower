package tw.com.fcb.flower.core.im.domain;

import java.math.BigDecimal;

public interface ImDomainFactory {

	ImDomain create(String fxNo, BigDecimal amount, String crcy);
	
}
