package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}
//-------------------------------------------------------------------------------------
	//get method returns iValue
	public int getiValue() {
		return iValue;
	}
//---------------------------------------------------------------------------------------
	//methods return true id iValue is even, odd, or prime
	public boolean isEven() {
		if ((iValue % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if ((iValue % 2) == 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		int i;
		for (i = 2; i < iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}
//---------------------------------------------------------------------------------------------
	//static methods return true id specified value is even, odd, or prime
	public static boolean isEven(int Value) {
		if ((Value % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int Value) {
		if ((Value % 2) == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int Value) {
		int i;
		for (i = 2; i < Value; i++) {
			if (Value % i == 0)
				return false;
		}
		return true;
	}
	
//------------------------------------------------------------------------------------------------
	//static methods for MyInteger that return true if specified value is even, odd, or prime
	public static boolean isEven(MyInteger Value) {
		return Value.isEven();
	}

	public static boolean isOdd(MyInteger Value) {
		return Value.isOdd();
	}

	public static boolean isPrime(MyInteger Value) {
		return Value.isPrime();
	}
//----------------------------------------------------------------------------------------------
	//return true if the value in the object is equal to the specified value
	public boolean equals(int Value) {
		return (Value == iValue);
	}

	public boolean equals(MyInteger Value) {
		return (Value.getiValue() == iValue);
	}
}
//-----------------------------------------------------------------------------------------------------