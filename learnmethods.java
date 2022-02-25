package week1.day1;

public class learnmethods {
	
	public void printName() 
	
	{
		System.out.println("My Name is Rukmini P");
	}

	private int add(int a, int b) 
	
	{
		int k= a+b;
		System.out.println(k);
		return k;
	}
	
	public long getMobileNumber()
	
	{
		long number = 9629577312L;
		return number;
	
	}
	
	public static void main (String xx[])
	
	{
	
		learnmethods obj = new learnmethods();
		obj.add(10, 20);
		obj.printName();
		long number = obj.getMobileNumber();
		System.out.println(number);
		
		
	
	}
	
	
	
	
	
	
	
}
