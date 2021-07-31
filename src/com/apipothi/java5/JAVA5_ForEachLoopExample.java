package com.apipothi.java5;

import java.util.ArrayList;
import java.util.List;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 1. JAVA 5 “Enhanced for Loop” OR “For-each loop” Example.
*/
public class JAVA5_ForEachLoopExample {

	public static void main(String[] args) {

		System.out.println("***Enhance For Loop Example***");

		/* START-1. Enhance For Loop in Array */
		System.out.println("-Start-Enhance For Loop Array Example-");
		int arrayValue[] = JAVA5_ForEachLoopExample.createArrayVAlue(10);
		JAVA5_ForEachLoopExample.getArrayVAlue(arrayValue);
		System.out.println("-End-Enhance For Loop Array Example-");
		/* End-1. Enhance For Loop inArray */

		/* START-1. Enhance For Loop in ArrayList */
		System.out.println("-Start-Enhance For Loop ArrayList Example-");
		List<Integer> al = JAVA5_ForEachLoopExample.createArrayListVAlue(10);
		JAVA5_ForEachLoopExample.getArrayListVAlue(al);
		System.out.println("-End-Enhance For Loop ArrayList Example-");
		/* End-1. Enhance For Loop in ArrayList */
	}

	private static void getArrayListVAlue(List<Integer> al) {

		List<Integer> alVaue = al;

		for (Integer value : alVaue) {

			System.out.print(value + " ");
		}

	}

	private static List<Integer> createArrayListVAlue(int i) {

		int index = i;

		List<Integer> al = new ArrayList<Integer>();

		for (int j = 0; j < index; j++) {
			al.add(j);
		}
		return al;
	}

	private static void getArrayVAlue(int[] arrayValue) {

		int[] arrValue = arrayValue;

		for (int value : arrValue) {
			System.out.print(value + " ");
		}

	}

	private static int[] createArrayVAlue(int i) {

		int index = i;
		int arr[] = new int[index];

		for (int j = 0; j < index; j++) {
			arr[j] = j;

		}

		return arr;
	}

}
