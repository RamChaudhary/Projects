package com.customException;

public class CustomException1 {
	
	static void ageValidate(int a) throws CustomException
	{
		if(a<18)
		{
			throw new CustomException("Age is not valid for vote");
		}
		else
		{
			System.out.println("You are eligible for vote");
		}
	}

}
