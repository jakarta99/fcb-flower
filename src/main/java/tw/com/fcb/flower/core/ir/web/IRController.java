package tw.com.fcb.flower.core.ir.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import tw.com.fcb.flower.core.commons.enums.ResponseStatus;
import tw.com.fcb.flower.core.commons.http.Response;
import tw.com.fcb.flower.core.ir.service.IRService;
import tw.com.fcb.flower.core.ir.web.cmd.IRCriteriaCmd;
import tw.com.fcb.flower.core.ir.web.cmd.IRSaveCmd;
import tw.com.fcb.flower.core.ir.web.cmd.SwiftMessageSaveCmd;
import tw.com.fcb.flower.core.ir.web.dto.IR;

@RestController
@RequestMapping("/ir")
public class IRController {
	
	@Autowired
	IRService service;

	@PostMapping("/swift")
	@Operation(description = "接收 swift 電文並存到 SwiftMessage", summary="儲存 swift")
	public void receiveSwift(SwiftMessageSaveCmd message) {
		service.insert(message);
	}
	
	@GetMapping("/swift/{id}")
	public Boolean getValidateResult(Long id) {
		return true;
	}
	
	@PostMapping
	public void insert(IRSaveCmd ir) {
		
	}
	
	@GetMapping("/count")
	public Integer getCount(IRCriteriaCmd criteria) {
		return 0;
	}
	
	@GetMapping("/{id}")
	public Response<IR> getById(Long id) {
		
		Response<IR> response = new Response<IR>();
		
		try {
			IR ir = service.getById(id);
			
			response = new Response<IR>();
			response.setStatus(ResponseStatus.SUCCESS);
			response.setCode("0000");
			response.setMessage(null);
			
			response.setData(ir);
		} catch (Exception ex) {
			// 不明錯誤 : 9999
			response.setStatus(ResponseStatus.ERROR);
			response.setCode("9999");
			response.setMessage("系統異常");
		}
		
		
		return response;
	}
	
	@PutMapping("/print")
	public void print(Long id) {
		
	}
	
	@PutMapping("/settle")
	public void settle(Long id) {
		
	}
	
}
