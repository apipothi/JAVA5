package com.apipothi.java5;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 5. JAVA 5  “Enum” Example.
*/
public enum Price {

	Redmi_7A(6999), SAMSUNG(5999), VIVO(8990), MI(4999);

	private int price;

	/* Enum Constructer Can not be public */
	/* Enum Constructer Can not be protected */
	Price(final int price) {
		this.price = price;
	}

}
