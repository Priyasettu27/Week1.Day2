package week1.day2;

import java.util.Arrays;

public class ArraysMissingElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,7,6,8};
		int arrLength=arr.length;
		//sort the array
		Arrays.sort(arr);
		System.out.println("The length of array is "+arrLength);
		
		//loop through the array(start i from arr[0] till the length of the array
		for (int i = arr[0]; i<=arr.length; i++) {
			
			//check if the iterator variable is not equal to the array values respectively.
			if (i!=arr[i-1]) {
				
				//print the number								
				System.out.print("The missing element is "+i);
				break;
				}}
				
		
	
}
}
			
				
								
			
		
			
				
			
		
		
		
	
		

	

	

