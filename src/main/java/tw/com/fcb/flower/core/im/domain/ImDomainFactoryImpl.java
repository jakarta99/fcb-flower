package tw.com.fcb.flower.core.im.domain;

import java.math.BigDecimal;

public class ImDomainFactoryImpl implements ImDomainFactory {

	@Override
	public ImDomain create(String fxNo, BigDecimal amount, String crcy) {
		return new ImDomainImpl(fxNo, amount, crcy);
	}
	
	

}
