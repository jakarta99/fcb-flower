package tw.com.fcb.flower.core.ir.web.dto;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="IR 匯入匯出資料")
public class IR {
	
	@Schema(description="交易序號")
	String seqNo;
	
	@Schema(description="交易日期")
	LocalDate txDate;

}
