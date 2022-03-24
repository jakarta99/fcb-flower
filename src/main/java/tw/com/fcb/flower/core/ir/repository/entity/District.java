package tw.com.fcb.flower.core.ir.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * FCB License .. 
 * 
 * 行政區
 * 
 * @author Gary Lee
 *
 */
@Entity
@Table(name = "DISTRICT")
@Getter
@Setter
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long id;
	
	@Column(name = "CODE")
	String code;
	
	@Column(name = "NAME")
	String name;

}
