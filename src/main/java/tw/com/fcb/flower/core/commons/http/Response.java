package tw.com.fcb.flower.core.commons.http;

import lombok.Data;
import tw.com.fcb.flower.core.commons.enums.ResponseStatus;

@Data
public class Response<T> {
	
	ResponseStatus status;
	
	String code;
	
	String message;
	
	T data;


}
