package tw.com.fcb.flower.core.cleanarchitecture.domain;

public class CommonUser implements User {

	String name;
	
	String password;
	
	public CommonUser(String name , String password) {
		this.name = name;
		this.password = password;
	}
	
	
	@Override
	public boolean passwordIsValid() {
		if(password == null || password.length() < 6) {
			return false;
		}
		return true;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

}
