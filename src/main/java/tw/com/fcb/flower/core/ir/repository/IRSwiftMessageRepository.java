package tw.com.fcb.flower.core.ir.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.com.fcb.flower.core.ir.repository.entity.IRSwiftMessage;

@Repository
public interface IRSwiftMessageRepository extends JpaRepository<IRSwiftMessage, Long>{

	Optional<IRSwiftMessage> findBySeqNo(String seqNo);
	
	List<IRSwiftMessage> findBySeqNoLike(String seqNoLike);
	
}
