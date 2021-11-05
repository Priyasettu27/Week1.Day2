package week1.day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		// get the length of the array
		int arrLength=arr.length;
		// declare an int variable named count
		int count;
		// iterate from 0 to the length of the array by adding 1 to it (outer loop starts here)						
		for(int i=0;i<arrLength;i++) {
			// assign 0 to count 
			count=0;
			// iterate from i to the array length-1 (inner loop starts here)
			for(int j=i;j<arrLength-1;j++) {
				// compare both the loop variables & check they're equal
				if(arr[i]==arr[j])
				{
				// increase the count if both the arrays are equal
					count=count+1;						
			}			
			}
			// Out of the inner loop, check and print the first array variable if count is more than 0
			if(count>1) {
				System.out.println(arr[i]);
			}
			
			
		}
	}

}
