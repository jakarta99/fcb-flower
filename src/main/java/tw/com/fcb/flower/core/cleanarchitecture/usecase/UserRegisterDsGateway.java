package tw.com.fcb.flower.core.cleanarchitecture.usecase;

import tw.com.fcb.flower.core.cleanarchitecture.usecase.model.UserDsRequestModel;

public interface UserRegisterDsGateway {
	
	boolean duplicateName(String name);
	
	void save(UserDsRequestModel request);
}

