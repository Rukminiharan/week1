package week1.day2;

public class Calculator {
	
	public int add(int num1,int num2,int num3)
	
	{ 
		int num4 = (num1+num2+num3);
		System.out.println("The sum of 3 numbers is"+num4);
		return num4;
}
	public int sub(int num1, int num2)
	
	{ 
	int num3 = (num2-num1);
	System.out.println("The difference is " +num3);
	return num3;

	}
	
	public double multiply (double num1, double num2)
	
	{ 
		double num3 = (num1*num2);
		System.out.println("The Produce is"+num3);
		return num3;
		
	}
	
	public float divide (float num1, float num2)
	
	{ 
		float num3 = (num1/num2);
		System.out.println("The Answer is "+num3);
		return num3;
		
	}
	
	public long module (long num1,long num2)
	
	{ 
		long num3 = (num1%num2);
		System.out.println("The module value is"+num3);
		return num3;
		
	}
}	
