package tw.com.fcb.flower.core.im.domain;

import java.math.BigDecimal;

public class ImDomainImpl implements ImDomain {
	
	String fxNo;
	BigDecimal amount;
	String crcy;
	
	ImDomainRepository repository;
	
	public void setRepository(ImDomainRepository repository) {
		this.repository = repository;
	}
	
	
	public ImDomainImpl(String fxNo, BigDecimal amount, String crcy) {
		this.fxNo = fxNo;
		this.amount = amount;
		this.crcy = crcy;
		
	}

	@Override
	public String getFxNo() {
		// TODO Auto-generated method stub
		return this.fxNo;
	}

	@Override
	public BigDecimal getAmount() {
		// TODO Auto-generated method stub
		return this.amount;
	}

	@Override
	public String getCrcy() {
		// TODO Auto-generated method stub
		return this.crcy;
	}

	@Override
	public boolean fxNoValid() {
		if(this.fxNo == null || this.fxNo.length() < 10) {
			return false;
		}
		return true;
	}

	@Override
	public void save() {
		
		repository.save(this); 
		
		
	}

}
