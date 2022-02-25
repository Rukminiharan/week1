package week1.day2;

import java.util.Arrays;

public class FindMissingElementInAnArray {

	public static void main(String[] args) {

		//int[] arr = {1,2,3,4,7,6,8};
		int[] arr = {20,11,13,14};
		 Arrays.sort(arr);
		
		
		for (int i = 0; i < arr.length-1; i++) 
		
		{
			
				if(arr[i+1]== (arr[i])+1); 
				
				else
					System.out.println(arr[i]+1);
		}
			
			
		
		
		

	}

}
