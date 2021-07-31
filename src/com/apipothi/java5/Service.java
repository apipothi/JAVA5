package com.apipothi.java5;

/*
 * Author    : API POTHI
 * YouTube   : https://www.youtube.com/apipothi
 * Play List : JAVA5
 * JAVA      : 1.8
 * Program   : 5. JAVA 5  “Enum” Example.
*/
public enum Service {

	GOOD {
		@Override
		public String getMyService() {
			String message = "Your Service is ->" + this;
			System.out.println(message);
			return message;
		}
	},
	BAD {
		@Override
		public String getMyService() {
			String message = "Your Service is ->" + this;
			System.out.println(message);
			return message;
		}
	},
	MEDIUM {
		@Override
		public String getMyService() {
			String message = "Your Service is ->" + this;
			System.out.println(message);
			return message;
		}
	},
	EXCELLENT {
		@Override
		public String getMyService() {
			String message = "Your Service is ->" + this;
			System.out.println(message);
			return message;
		}
	};

	protected String priceService() {
		String message = "Your Service is ->" + this;
		System.out.println(message);
		return message;
	}

	public String priceMyService() {
		String message = "Your Service is ->" + this;
		System.out.println(message);
		return message;
	}

	/* Un-implemented Method */
	public abstract String getMyService();
}
