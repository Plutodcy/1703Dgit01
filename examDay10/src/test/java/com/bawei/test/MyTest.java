package com.bawei.test;

import java.util.Date;

import org.junit.Test;

import com.bawei.util.DateUtil;

public class MyTest {

	@Test
	public void test01(){
		Date date = new Date(2010, 07, 17);
		int i = DateUtil.getAge(date);
		
		System.out.println(i);
		
	}
	@Test
	public void test02(){
		Date date = new Date(2019, 07, 17, 23, 23, 23);
		Date date2 = DateUtil.getDateByMonthInit(date);
		
		System.out.println(date2+"----");
		
	}
	@Test
	public void test03(){
		Date date = new Date(2019, 7, 17, 23, 23, 23);
		Date date2 = DateUtil.getDateByMonthLast(date);
		
		System.out.println(date2+"----");
	}
	@Test
	public void test04(){
		Date date = new Date(2020, 07, 17, 23, 23, 23);
		int date2 = DateUtil.getDaysByFuture(date);
		System.out.println(date2+"----");
		
	}
	@Test
	public void test05(){
		Date date = new Date(2018, 07, 17, 23, 23, 23);
		int date2 = DateUtil.getDaysByDeparted(date);
		System.out.println(date2+"----");
	}
}
