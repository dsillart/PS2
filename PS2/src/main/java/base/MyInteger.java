package base;

public class MyInteger {
	

		
	//Attribute; stores the int value of the obj
	
	private int iValue;
	
	public static void main(String[] args) {
	
		System.out.println("Enter an integer:");
	}	
		
	//Constructor; creates a MyInteger obj using iValue.
	public MyInteger(int i) {
		
		iValue = i;
	}
	
	//Getter; returns the iValue
	public int getiValue() {
		
		return iValue;
	}
	
	//Method; returns true if iValue is even, false if it isn't
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	//Method; returns true if iValue is odd, false if it isn't

	public boolean isOdd() {
		if (iValue % 2 == 1) {
			return true;
			}	
		
		return false;
	}	
	
	//Method; returns true if iValue is prime, false if it isn't

	public boolean isPrime() {
		for (int i=2; i<iValue; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	//Static Method; returns true if iValue is even, false if it isn't
	public static boolean isEven(int i) {
		if (i % 2 == 0){
			return true;
		}
		
		return false;
	}
	
	//Static Method; returns true if iValue is odd, false if it isn't
	public static boolean isOdd(int i) {
		if (i % 2 == 1){
			return true;
		}
		
		return false;
	}
	
	
	//Static Method; returns true if iValue is prime, false if it isn't
	public static boolean isPrime(int i) {
		for (int j=2; j<i; j++) {
			if (i % j == 0) {
				return false;		
			}
		}
		
		return true;
	}
	
	//Static Method; returns true if iValue is equal to the specified, false if it isn't
	
	public static boolean isEven(MyInteger evenInt) {
		int evenTestVal = evenInt.getiValue();
		if (evenTestVal % 2 == 0) {
			return true;
		}
		
		return false;
	}
	
	//Static Method; returns true if iValue is equal to the specified, false if it isn't
	
	public static boolean isOdd(MyInteger oddInt) {
		int oddTestVal = oddInt.getiValue();
		if (oddTestVal % 2 == 1) {
			return true;
		}
		
		return false;
	}
	
	//Static Method; returns true if iValue is equal to specified, false if it isn't
	
	public static boolean isPrime(MyInteger primeInt) {
		int primeTestVal = primeInt.getiValue();
		for (int j=2; j<primeTestVal; j++) {
			if (primeTestVal % j == 0) {
				return false;		
			}
		}
		
		return true;
	}
	
	//Equals Method; returns true if iValue is equal to specified, false if it isn't
	
	public boolean equals(int iEqual) {
		
		return iValue == iEqual;
	}
	
	//Equals Method; returns true if iValue is equal to specified, false if it isn't
	
	public boolean equals(MyInteger intEqual) {
		
		return intEqual.getiValue() == iValue;
		}
	}