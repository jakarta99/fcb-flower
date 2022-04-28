package tw.com.fcb.flower.core.ir.domain;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class IrDomain {

	String seqNo;
	
	String fromAccount;
	
	String toAccount;
	
	BigDecimal amount;
	
	String crcy;
	
	
	public void 解款() {
		// 讀取 swfit 資訊
		
		// 檢核
		
		// 手續費計算
		
		// 入客戶帳戶
		
		// 手續費外收
		
	}
	
	public void 退匯() {
		
	}
	
	
	
}
