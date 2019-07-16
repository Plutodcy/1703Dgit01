package com.bawei.test;

import java.util.Scanner;

import org.junit.Test;

import com.bawei.util.StreamUtil;

public class MyTest {

	@Test
	public void test01(){
		
	}
	@Test
	public void test02(){
		
	}
	@Test
	public void test03(){
		
	}
	@Test
	public void test04(){
		
	}
	@Test
	public void test05(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输出您的姓名：");
		
		String str = input.next();
		if(str!=null){
			System.out.println(StreamUtil.readStringFromSystemIn(str));
		}
	}
	@Test
	public void test06(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输出您的年龄：");
		
		String str = input.next();
		int i = StreamUtil.readIntFromSystemIn(str);
		if(i==0){
			System.out.println("输入格式错误,请重新输入");
		}else{
			System.out.println(i);
		}
	}
}
