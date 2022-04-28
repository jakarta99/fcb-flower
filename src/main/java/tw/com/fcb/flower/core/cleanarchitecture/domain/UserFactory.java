package tw.com.fcb.flower.core.cleanarchitecture.domain;

public interface UserFactory {

	User create(String name, String password);
	
}
