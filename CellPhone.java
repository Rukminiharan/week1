package week1.day2;

public class CellPhone {

//Naming convention in Java - methodName, ClassName, variableName will correct from next program
	
public void callFriend ()

{
	System.out.println("Calling Friend");
}

public void messageAmma ()

{
	System.out.println("Text Sent to Amma");
}



public static void main(String[] args) 

{
	// TODO Auto-generated method stub
	
	CellPhone obj = new CellPhone();
	obj.callFriend();
	obj.messageAmma();
	
}
}
