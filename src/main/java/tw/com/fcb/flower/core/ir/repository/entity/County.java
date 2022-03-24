package tw.com.fcb.flower.core.ir.repository.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * 縣市
 * 
 * @author Gary Lee
 *
 */
@Entity
@Table(name = "COUNTY")
@Getter
@Setter
public class County {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Long id;
	
	@Column(name = "CODE")
	String code;
	
	@Column(name = "NAME")
	String name;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
	@JoinColumn(name = "COUNTY_ID")
	List<District> districts; // EAGER: select * from COUNTY c join DISTRICT d on  c.ID = d.COUNTY_ID
	
	
	
	
	
}
