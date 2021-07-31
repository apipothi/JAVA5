package com.apipothi.java5;
/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 3. JAVA 5 Custom Generic Class Example.
*/

public class GenericEx<T> {

	private  T myData;
	private T myta;

	public T getData() {

		return myData;

	}

	public T getMyData(T a, T b, T c) {

		return myData;

	}

	public GenericEx(T myData, T myta) {
		super();
		this.myData = myData;
		this.myta = myta;
	}

	public static void main(String[] args) {
		String a = "API";
		String b = "API";

		Integer a1 = 1;
		Integer b1 = 2;

		GenericEx ex = new GenericEx<String>(a, b);
		ex.getData();

		GenericEx exInt = new GenericEx<Integer>(a1, b1);
		ex.getData();

	}

}
