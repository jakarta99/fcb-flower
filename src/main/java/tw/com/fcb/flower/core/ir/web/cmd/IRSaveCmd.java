package tw.com.fcb.flower.core.ir.web.cmd;

import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description="IR 匯入匯出資料")
@Data
public class IRSaveCmd {

	@Schema(description="交易序號")
	String seqNo;
	
	@Schema(description="交易日期")
	LocalDate txDate;
}
