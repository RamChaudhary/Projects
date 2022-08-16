package com.commonExample;

public class SingletonClassExample {
	
	private static SingletonClassExample singletonClassExample=null;
	private SingletonClassExample()
	{
		
	}
	public static SingletonClassExample getInstanceObj()
	{
		if(singletonClassExample==null)
		{
			singletonClassExample=new SingletonClassExample();
		}
		return singletonClassExample;
	}
	
	
	public static SingletonClassExample getNewObject()
	{
		return new SingletonClassExample();
	}
	
	public void getDetails()
	{
		System.out.println("get details method");
	}
	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

		SingletonClassExample obj1=SingletonClassExample.getInstanceObj();
		System.out.println(obj1);
		SingletonClassExample obj2=SingletonClassExample.getInstanceObj();
		System.out.println(obj2);
		
		singletonClassExample=null;
		
		SingletonClassExample obj5=SingletonClassExample.getInstanceObj();
		System.out.println(obj5);
		SingletonClassExample obj6=SingletonClassExample.getInstanceObj();
		System.out.println(obj6);

		
		
		//create every time new object
		SingletonClassExample obj3=SingletonClassExample.getNewObject();
		System.out.println(obj3);
		SingletonClassExample obj4=SingletonClassExample.getNewObject();
		System.out.println(obj4);
	}

}
