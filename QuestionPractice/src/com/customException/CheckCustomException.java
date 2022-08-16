package com.customException;

public class CheckCustomException {

	
	public static void main(String[] args) {
		
		
		try {
			
			CustomException1.ageValidate(17);
			
		} catch (CustomException e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
