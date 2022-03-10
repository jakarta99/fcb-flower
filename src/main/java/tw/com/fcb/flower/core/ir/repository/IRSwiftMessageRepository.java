package tw.com.fcb.flower.core.ir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.com.fcb.flower.core.ir.repository.entity.IRSwiftMessage;

@Repository
public interface IRSwiftMessageRepository extends JpaRepository<IRSwiftMessage, Long>{

}
