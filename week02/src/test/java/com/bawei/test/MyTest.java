package com.bawei.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.bawei.utils.AssertUtil;
import com.bawei.utils.WeekRunTimeException;

public class MyTest {
	
	//断言为真
	@Test
	public void test01(){
		try {
			AssertUtil.isTrue(true, "这不是true");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言为假
	@Test
	public void test02(){
		try {
			AssertUtil.isFalse(true, "这不是false");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言字符串必须有值
	@Test
	public void test03(){
		try {
			AssertUtil.hasLength("sds", "这个字符串没有值");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言字符串必须有空
	@Test
	public void test04(){
		try {
			AssertUtil.hasNoLength("sds", "这个字符串有值");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言对象必须有值
	@Test
	public void test05(){
		try {
			AssertUtil.isNull("sds", "这个对象为null");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言对象必须为null
	@Test
	public void test06(){
		try {
			AssertUtil.isNoNull(null, "这个对象有值");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言 List 或 Set 集合不为空，没有元素也算空
	@Test
	public void test07(){
		try {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(1);
			AssertUtil.collectionNotNull(list, "这个集合为空");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言 Map集合不为空，没有元素也算空
	@Test
	public void test08(){
		try {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "sdf");
			AssertUtil.mapNotNull(map, "这个map为空");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言字符串必须有值，去掉空格后，长度必须大于 0
	@Test
	public void test09(){
		try {
			AssertUtil.hadText(" 9u9j", "这个字符串长度小于或等于0");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	//断言值必须是正数(值大于 0)
	@Test
	public void test10(){
		try {
			AssertUtil.absInt(-1, "这个数字不是正整数,不大于0");
		} catch (WeekRunTimeException e) {
			e.printStackTrace();
		}
	}
	

}
