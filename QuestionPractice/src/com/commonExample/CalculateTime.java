package com.commonExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalculateTime {

	
	public static void dateDifferent(String startDate,String endDate) throws Exception
	{
		SimpleDateFormat formate=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		Date date1 = formate.parse(startDate);
		Date date2 = formate.parse(endDate);
		
		long diff_in_time=date2.getTime() - date1.getTime();
		
		long diff_in_second=(diff_in_time/1000)%60;
		System.out.println(diff_in_second+" seconds");
	}
	
	
	
}
