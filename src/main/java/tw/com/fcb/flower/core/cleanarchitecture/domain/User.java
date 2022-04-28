package tw.com.fcb.flower.core.cleanarchitecture.domain;

public interface User {
	
	boolean passwordIsValid();
	
	String getName();
	
	String getPassword();

}
