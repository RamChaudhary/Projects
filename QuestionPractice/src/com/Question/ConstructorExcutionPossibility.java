package com.Question;

public class ConstructorExcutionPossibility {
	
	ConstructorExcutionPossibility()
	{
		System.out.println("Default constructor..");
	}
	ConstructorExcutionPossibility(String str)
	{
		System.out.println("String parameter constructor");
	}
	ConstructorExcutionPossibility(Object obj)
	{
		System.out.println("Object parameter constructor");
	}
	
	public static void main(String[] args) {
		ConstructorExcutionPossibility obj=new ConstructorExcutionPossibility(null);
	}

}
