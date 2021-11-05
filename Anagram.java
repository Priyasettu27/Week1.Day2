package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		//Declare a String 
			String Str1 = "stops";
			//Declare another String
			String Str2 = "potss";
			//Check length of the strings are same then (Use A Condition)
			if(Str1.length()== Str2.length()) {
				//Convert both Strings in to characters
				char[] Charr1 = Str1.toCharArray();
				char[] Charr2= Str2.toCharArray();
				//Sort Both the arrays
				Arrays.sort(Charr1);  
				Arrays.sort(Charr2);
				System.out.println(Arrays.toString(Charr1));
		        System.out.println(Arrays.toString(Charr2));
		        //Check both the arrays has same value
		        Arrays.equals(Charr1, Charr2);  
		       System.out.println("Both arrays has same value");
		         

	}}}
	