package tw.com.fcb.flower.core.cleanarchitecture.usecase;

import tw.com.fcb.flower.core.cleanarchitecture.usecase.model.UserResponseModel;

public interface UserPresenter {

	UserResponseModel prepareSuccessView(UserResponseModel user);
	
	UserResponseModel prepareFailView(String error);
	
}
