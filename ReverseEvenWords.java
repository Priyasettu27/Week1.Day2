package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
			String test = "I am a software tester";
			String[] splitArr = test.split(" ");
			System.out.println("Splitting and traversing the string");
			System.out.println("***************************************");
			for (int i = 0; i < splitArr.length; i++) {
				System.out.println("splitArr["+i+"]: " + splitArr[i]);
			}
			
			System.out.println("\nPrinting the even position words in reverse order");
			System.out.println("***************************************************");
			for (int i = 0; i < splitArr.length; i++) {
				    	if (i % 2 != 0) {
				    		char arr1[] = splitArr[i].toCharArray();
							for (int j = (arr1.length) - 1; j >= 0; j--) {
								System.out.print(arr1[j]);
							}
							System.out.print(" ");	
					}

					else {
						System.out.print(splitArr[i]);
						System.out.print(" ");
					}

				}
		}
	}