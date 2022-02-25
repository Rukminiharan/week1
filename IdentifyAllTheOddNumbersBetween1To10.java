package week1.day2;

public class IdentifyAllTheOddNumbersBetween1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i<=10; i++)
		{
			if (i%2 !=0)
			{
				System.out.println("The Number is Odd" +i);
			}
			else 
			{
				System.out.println("The Number is Even" +i);
			}
		}
	}

}
