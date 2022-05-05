package org.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class loop {
public static void main(String[] args) {
		Map<Integer,String> a=new HashMap<Integer,String>();
		 a.put(10,"");
		 a.put(20, "sql");
		 a.put(30, "oops");
		 a.put(40, "sql");
		 a.put(50, "oracle");
		 a.put(60, "Db");
		 a.put(10, "selenium");
		 a.put(50, "psql");
		 a.put(40, "Hadoop");
		 System.out.println(a);
		 Set<Entry<Integer,String>> s =a.entrySet();
		// System.out.println(s);
				for(Entry<Integer,String> x:s) {
					System.out.println("Keys:"+x.getKey());
					System.out.println("Values:"+x.getValue());
				}

	
}}


