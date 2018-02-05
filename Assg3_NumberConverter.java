import java.util.Scanner;

public class Assg3_NumberConverter {

	public static void main(String[] args) {
		
		//3) Prompt the user to enter a number or a character
	    //-convert that number or character to Binary or Hexadecimal
	    //-print the output of the conversion
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number of character");
		String input = scan.nextLine();
		
		for(int i = 0; i < input.length(); i++)
		{
			if(!Character.isLetterOrDigit(input.charAt(i)))
			{
				System.out.println("Invalid input");
				return;
			}
		}
		
		if(Character.isLetter(input.charAt(0)))
		{
			System.out.println("fetched the first Character");
			System.out.println("Its hex is " + Integer.toHexString((int)input.charAt(0)));
			System.out.println("Its Binary is " + Integer.toBinaryString((int)input.charAt(0)));
		}
		else
		{
			int number = Integer.parseInt(input);
			System.out.println("fetched as a number");
			System.out.println("Its hex is " + Integer.toHexString(number));
			System.out.println("Its Binary is " + Integer.toBinaryString(number));
		}
		
	}
	
	
	

}
