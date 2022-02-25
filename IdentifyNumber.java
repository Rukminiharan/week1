package week1.day2;

public class IdentifyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IdentifyNumber obj = new IdentifyNumber();
		obj.number(100000);
		obj.number_1(201);

	}
	
	public void number (long a)
	
	{
		if ( a % 2 == 0)
			System.out.println("Even"+a);
		else
			System.out.println("Odd"+a);
	}

public void number_1 (long a)
	
	{
		if ( a % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
