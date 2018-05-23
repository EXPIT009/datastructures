package org.paypal.client;

import java.util.Iterator;
import java.util.Set;

import org.paypal.Map;
import org.paypal.MyHashMap;
import org.paypal.MyHashMap.Entry;

public class TestClass {

	public static void main(String[] args) {
		Map<Integer,String>  map=new MyHashMap();
		map.put(111, "Anil");
		map.put(211, "Harish");
		map.put(311, "Alla");
		map.put(444, "Mommo");
		map.put(1, "Anil Samelia");
		map.put(548, null);
		map.put(111, "anil");
		map.put(null, "paypal");
		System.out.println(map);
		
		Set<org.paypal.Map.Entry<Integer, String>> h=map.entrySet();
		Iterator itr=h.iterator();
		while (itr.hasNext()) {
			Entry str=(Entry) itr.next();
			System.out.println(str.getKey()+"------- "+str.getValue());
			
		}
		
	}

}
