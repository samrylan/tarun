package org.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Hello {
	 public static void main(String[] args) {
		TreeMap<String,String> a=new TreeMap<String,String>();
		 a.put("!","10");
		 a.put("@", "20");
		 a.put("#", "30");
		 a.put("$", "40");
		 a.put("%", "50");
		 a.put("^", "60");
		 a.put("&", "10");
		 a.put("*", "50");
		 a.put("(", "409");
		 System.out.println(a);
		 Set<Entry<String,String>> k=a.entrySet();
		 for(Entry<String,String>x:k) {
	// System.out.println(x);
	 System.out.println("key:"+x.getKey());
	 System.out.println("Values:"+ x.getValue());
			 
		 }								 }
}