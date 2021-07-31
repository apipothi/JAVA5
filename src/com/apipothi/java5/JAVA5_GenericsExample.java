package com.apipothi.java5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 3. JAVA 5  “Generics” Example.
*/
public class JAVA5_GenericsExample {

	public static void main(String[] args) {

		String[] str = new String[10];
		str[0] = "API";
		str[1] = "POTHI";
		str[2] = "LEARN";
		str[3] = "CODE";
		str[4] = "DEPLOY";
		// str[5] = 1;

		List al = new ArrayList();
		al.add("API");
		al.add("POTHI");
		al.add("LEARN");
		al.add("CODE");
		al.add("DEPLOY");
		al.add(1);
		al.add(2.2);
		
		for (Object object : al) {
			String str1=(String) object;
			System.out.println(str1);
		}
		
		List<String> myList=new ArrayList<String>();
		List<Integer> myListInt=new ArrayList<Integer>();
		Map<Integer,String> myMap =new HashMap<Integer,String>();
		

	}
	

}
