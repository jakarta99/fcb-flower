package tw.com.fcb.flower.core.im.domain;

import java.math.BigDecimal;

public interface ImDomain {

	String getFxNo();
	
	BigDecimal getAmount();
	
	String getCrcy();
	
	
	boolean fxNoValid();
	
	void save();
	
}
