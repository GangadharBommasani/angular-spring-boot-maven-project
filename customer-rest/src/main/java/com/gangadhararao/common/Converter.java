package com.gangadhararao.common;

public interface Converter<I, O> {
	
	O convert(I input);

}
