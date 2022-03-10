package tw.com.fcb.flower.core.ir.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.com.fcb.flower.core.ir.repository.IRSwiftMessageRepository;
import tw.com.fcb.flower.core.ir.repository.entity.IRSwiftMessage;
import tw.com.fcb.flower.core.ir.web.cmd.SwiftMessageSaveCmd;

@Transactional
@Service
public class IRService {
	
	@Autowired
	IRSwiftMessageRepository repository;
	
	public void insert(SwiftMessageSaveCmd saveCmd) {
		// beginTx
		
		
		IRSwiftMessage entity = new IRSwiftMessage();
		
//		entity.setSeqNo(saveCmd.getSeqNo());
//		entity.setValueDate(saveCmd.getValueDate());
		
		BeanUtils.copyProperties(saveCmd, entity);
		
		repository.save(entity);
		
		
		
		// commitTx
	}

}
