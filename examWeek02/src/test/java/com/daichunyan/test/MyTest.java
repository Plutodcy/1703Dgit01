package com.daichunyan.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.daichunyan.util.AssertUtil;

public class MyTest {
	
	@Test
	public void test01(){
		try {
			AssertUtil.isTrue(false, "这是假的");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test02(){
		try {
			AssertUtil.isFalse(true, "这是真的");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test03(){
		try {
			AssertUtil.notNull(null, "对象为null");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test04(){
		try {
			AssertUtil.isNull("kjo", "对象不为null");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test05(){
		try {
			ArrayList<Integer> list = new ArrayList<Integer>();
//			list.add(3);
			AssertUtil.notEmpty(list, "集合为null");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test06(){
		try {
			HashMap<Integer,String> map = new HashMap<Integer,String>();
//			map.put(1, "value");
			AssertUtil.notEmpty(map, "map为null");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test07(){
		try {
			AssertUtil.hasText(" ", "字符串无值");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Test
	public void test08(){
		try {
			AssertUtil.greaterThanZero(0, "值小于或等于0");
		} catch (RuntimeException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
