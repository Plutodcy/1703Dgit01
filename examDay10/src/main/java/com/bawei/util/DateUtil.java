package com.bawei.util;

import java.util.Date;

import org.junit.Test;

public class DateUtil {
	//方法1：根据传入的日期获取年龄
	public static int getAge (Date src) {
		Date date = new Date(2019,07,17);
		
		int year = date.getYear();
	
		
		int year1 = src.getYear();
		
		int a=year-year1;
		
		return a;
	}

	//方法2：根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	public static Date getDateByMonthInit (Date src) {
		src.setMinutes(00);
		src.setHours(00);
		src.setSeconds(00);
		src.setDate(01);
		return src;
		
	}
	//方法3 :根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		
		src.setMinutes(59);
		src.setHours(23);
		src.setSeconds(59);
		int year = src.getYear();
		if(year==1||year==3||year==5||year==7||year==8||year==10||year==12){
			src.setDate(31);
		}else if(year==2){
			src.setDate(28);
		}else{
			src.setDate(30);
		}
		return src;

	}

	//方法4：求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		Date date = new Date(2019,07,17);
		
		int year = date.getYear();
		int month = date.getMonth();
		int date2 = date.getDate();
		
		int year1 = future.getYear();
		int month1 = future.getMonth();
		int date3 = future.getDate();
		
		int a=year1-year;
		int b=month1-month;
		int c=date3-date2;
		
		int sum=a*365+b*30+c;
		return sum;
	}

	//方法5：求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		
		Date date = new Date(2019,07,17);
		
		int year = date.getYear();
		int month = date.getMonth();
		int date2 = date.getDate();
		
		int year1 = departed.getYear();
		int month1 = departed.getMonth();
		int date3 = departed.getDate();
		
		int a=year-year1;
		int b=month-month1;
		int c=date2-date3;
		
		int sum=a*365+b*30+c;
		return sum;
	}
}
