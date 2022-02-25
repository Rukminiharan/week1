package week1.day2;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 30;
		
		if (age == 1)
		{
			System.out.println("Infant");
		}
		else if (age <= 3)
		{
			System.out.println("Toddler");
		}
		else if (age >=4 && age <=6)
			{
			System.out.println("Pre-Schooler");
			}
		else if (age > 6 && age <=12)
		{
			System.out.println("Kids");
			
		}
		else if (age > 12 && age <=19 )
		{
			System.out.println("Teens");
		}
		else 
		{
			System.out.println("Adult");
	}
	}

}
