package com.apipothi.java5;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 5. JAVA 5  “Enum” Example.
*/
public class JAVA5_Enum {

	public static void main(String[] args) {

		Service badService = Service.BAD;
		Service goodService = Service.GOOD;
		Service mediumService = Service.MEDIUM;
		Service excellentService = Service.EXCELLENT;
		System.out.println("-------------------------------1.Simple Enum------------------------------------------");
		System.out.println(badService + "\n" + goodService + "\n" + mediumService + "\n" + excellentService);

		System.out.println("-------------------------------2.ORDINAL------------------------------------------");

		System.out.println(Service.BAD.ordinal());// 1
		System.out.println(Service.GOOD.ordinal());// 0
		System.out.println(Service.MEDIUM.ordinal());// 2
		System.out.println(Service.EXCELLENT.ordinal());// 3

		System.out.println("-------------------------------3.VALUES------------------------------------------");

		Price[] price = Price.values();
		for (Price price2 : price) {
			System.out.println(price2);
		}

		System.out.println("-------------------------------4.VALUEOf------------------------------------------");
		System.out.println(Price.valueOf("Redmi_7A"));
		System.out.println(Price.valueOf("SAMSUNG"));
		System.out.println(Price.valueOf("VIVO"));
		System.out.println(Price.valueOf("MI"));

		System.out.println("-------------------------------5.Method Call------------------------------------------");
		
		String badMyService1=Service.BAD.priceService();
		String goodMyService1=Service.GOOD.priceService();
		String medMyService1=Service.MEDIUM.priceService();
		String excMyService1=Service.EXCELLENT.priceService();
		
		System.out.println("-------------------------------6.Method Call------------------------------------------");
		String badMyService2=Service.BAD.priceMyService();
		String goodMyService2=Service.GOOD.priceMyService();
		String medMyService2=Service.MEDIUM.priceMyService();
		String excMyService2=Service.EXCELLENT.priceMyService();
		
		System.out.println("-------------------------------7.Method Call------------------------------------------");
		String badMyService3=Service.BAD.getMyService();
		String goodMyService3=Service.GOOD.getMyService();
		String medMyService3=Service.MEDIUM.getMyService();
		String excMyService3=Service.EXCELLENT.getMyService();
		
		Price p=Price.MI;
		System.out.println(p);
		
		
	}

}
