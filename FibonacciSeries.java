package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {


		//Fibonacci Series - where sum of first two numbers of the series equals to the next number
		//in the series. 
		
		//Fibonacci Series = 0,1,1,2,3,5,8,13,21,....
		
		int range = 21;
		int num1 = 0;
		int num2 = 1;
		
		System.out.println(num1);
		
		for (num1=1; num1<=range; ++num1) //using pre increment operator as the first number in the series is known
		{
			System.out.println(num1);
			int num3 = num1+num2;
			num1 = num2;
			num2= num3;
			
	}
	}

}
