package tw.com.fcb.flower.core.cleanarchitecture.usecase;

import tw.com.fcb.flower.core.cleanarchitecture.usecase.model.UserRequestModel;
import tw.com.fcb.flower.core.cleanarchitecture.usecase.model.UserResponseModel;

public interface UserInputBoundary {

	UserResponseModel create(UserRequestModel request);
	
}
