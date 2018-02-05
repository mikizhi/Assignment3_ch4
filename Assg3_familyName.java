import java.util.Scanner;
public class Assg3_familyName {

	public static void main(String[] args) {
		
			
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please input your full name for me: ");
				String fullName = scan.nextLine();
				String[] spaceBW = fullName.split(" ");
				String lastName = spaceBW[spaceBW.length-1];
				System.out.println("Hello User, your family name is: " +lastName);

}
}