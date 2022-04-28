package tw.com.fcb.flower.core.cleanarchitecture.repository;

import tw.com.fcb.flower.core.cleanarchitecture.usecase.UserRegisterDsGateway;
import tw.com.fcb.flower.core.cleanarchitecture.usecase.model.UserDsRequestModel;

public class JpaUser implements UserRegisterDsGateway {

	@Override
	public boolean duplicateName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void save(UserDsRequestModel request) {
		// TODO Auto-generated method stub
		
	}

}
