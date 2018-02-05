//1. square root		
import java.util.Scanner;
public class Assg3_squareRoot{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

				System.out.println("Please enter the number you want in order to get the answer of its square root: ");
				int num = scan.nextInt();
				double ans = Math.sqrt(num);
						System.out.println("The square root of the " +num +" is the answer"+ ans);

}
}