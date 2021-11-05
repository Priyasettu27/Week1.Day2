package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not  		
		//Declare A String value as"madam"
				String str ="madam";
		//Declare another String rev value as ""
				String rev = "";
				 int length = str.length(); 
		//Iterate over the String in reverse order
				 for ( int i = length - 1; i >= 0; i-- )  
		//Add the char into rev
			         rev = rev + str.charAt(i);  
		//Compare the original String with the reversed String, if it is same then print palinDrome 
				   if (str.equals(rev))  
				         System.out.println("Given string is a palindrome"); 
				   else
					   System.out.println("Given string is not a Palindrome");
			}
			}
