package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		
		// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;
		//convert the string into char array
		char[] str1 = str.toCharArray();
		System.out.println("Characters in the String ");
		//get the length of the array
		// traverse from 0 till the array length 
		int arrLength=str1.length;
		for (int i = 0; i < arrLength; i++) {
			}
		System.out.println(arrLength);
		System.out.println("Traversed characters in the Array are listed below:");
		// Check the char array has the particular char in it 
		for (int i = 0; i <arrLength; i++) {
			// if is has increment the count
			if (str1[i] == 'e') {
				count++;
				System.out.println(str1[i]);
			}

		}
		// print the count out of the loop
		System.out.println("Traversed characteras count: "+count);

	}
}