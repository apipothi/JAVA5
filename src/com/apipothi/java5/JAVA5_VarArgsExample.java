package com.apipothi.java5;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 2. JAVA 5  “Var Args” OR “Variable Arguments” Example.
*/
public class JAVA5_VarArgsExample {

	public static void main(String[] args) {

		System.out.println("Variable Arguments - Example");

		System.out.println("Number - Example");
		JAVA5_VarArgsExample.add(1);
		JAVA5_VarArgsExample.add(1, 2);
		JAVA5_VarArgsExample.add(1, 2, 3);

		System.out.println("String with Number - Example");
		JAVA5_VarArgsExample.myAdd("API POTHI", 1);
		JAVA5_VarArgsExample.myAdd("API POTHI", 1, 2);
		JAVA5_VarArgsExample.myAdd("API POTHI", 1, 2, 3);
		JAVA5_VarArgsExample.myAdd("API POTHI", 1, 2, 3, 4);

		/*
		 * System.out.println("Error - Example");
		 * JAVA5_VarArgsExample.checkError(1, "API POTHI");
		 * JAVA5_VarArgsExample.checkError(1, 2, "API POTHI");
		 * JAVA5_VarArgsExample.checkError(1, 2, 3, "API POTHI");
		 */

		System.out.println("String - Example");
		JAVA5_VarArgsExample.myDisplay("API POTHI");
		JAVA5_VarArgsExample.myDisplay("API POTHI", "JAVA");
		JAVA5_VarArgsExample.myDisplay("API POTHI", "JAVA", "DS");

		System.out.println("String with Number - Example");
		JAVA5_VarArgsExample.display("API POTHI", 1);
		JAVA5_VarArgsExample.display("API POTHI", 1, 2);
		JAVA5_VarArgsExample.display("API POTHI", 1, 2, 3);
		
	}

	private static void display(String string, int... i) {

		System.out.println("Number of Arguments is ->" + i.length);
	}

	private static void myDisplay(String... string) {

		System.out.println("Number of Arguments is ->" + string.length);
	}

	/*
	 * private static void checkError(int... i, String string) {
	 * 
	 * }
	 */
	private static void myAdd(String string, int... i) {
		System.out.println("Number of Arguments is ->" + i.length);

	}

	private static void add(int... i) {
		System.out.println("Number of Arguments is ->" + i.length);

	}

}
