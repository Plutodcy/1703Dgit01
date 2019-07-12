package com.bawei.utils;

import java.util.Collection;
import java.util.Map;

public class AssertUtil {
	
	//断言为真
	public static void isTrue(Boolean b,String str){
		if(!Boolean.TRUE.equals(b)){
			throw new WeekRunTimeException(str);
		}
	}
	
	//断言为假
	public static void isFalse(Boolean b,String str){
		if(!Boolean.FALSE.equals(b)){
			throw new WeekRunTimeException(str);
		}
	}
	//断言字符串必须有值
	public static void hasLength(String s,String str){
		if(s==null || s.length()==0){
			throw new WeekRunTimeException(str);
		}
	}
	
	//断言对象必须有为空
	public static void isNull(Object obj,String str){
		if(obj!=null){
			throw new WeekRunTimeException(str);
		}
	}
	//断言对象必须有值
	public static void isNoNull(Object obj,String str){
		if(obj!=null){
			throw new WeekRunTimeException(str);
		}
	}
	
	//断言字符串必须为空
	public static void hasNoLength(String s,String str){
		if(s!=null || s.length()!=0){
			throw new WeekRunTimeException(str);
		}
	}
	
	//断言 List 或 Set 集合不为空，没有元素也算空
	public static void collectionNotNull(Collection<?> col,String str){
		if(col==null || col.size()==0){
			throw new WeekRunTimeException(str);
		}
	}
	//断言 Map集合不为空，没有元素也算空
	public static void mapNotNull(Map<?, ?> col,String str){
		if(col==null || col.size()==0){
			throw new WeekRunTimeException(str);
		}
	}
	//断言字符串必须有值，去掉空格后，长度必须大于 0
	public static void hadText(String s,String str){
		if(!(s.trim().length()>0)){
			throw new WeekRunTimeException(str);
		}
	}
	
	// 断言值必须是正数(值大于 0)
	public static void absInt(int s,String str){
		if(!(s>0)){
			throw new WeekRunTimeException(str);
		}
	}
	
}
