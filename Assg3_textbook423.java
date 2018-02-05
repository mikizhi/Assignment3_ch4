import java.util.Scanner;
public class Assg3_textbook423 {

	public static void main(String[] args) {
		
/* 4.23 from Chapter4 on textbook
	 (Financial application: payroll) 
	 Write a program that reads the following information and prints a payroll statement:
		Employee’s name (e.g., Smith)
		Number of hours worked in a week (e.g., 10) 
		Hourly pay rate (e.g., 9.75)
		Federal tax withholding rate (e.g., 20%) 
		State tax withholding rate (e.g., 9%)	
	 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the Employee's name: ");
		String name = scan.nextLine();
		
		System.out.println("Please enter the number of hours worked in a week: ");
		double wkHour = scan.nextDouble();
		
		System.out.println("Please enter the hourly pay rate: ");
		double rateHour = scan.nextDouble();
		
		System.out.println("Please enter the federal tax withholding rate: ");
		double taxFdRate = scan.nextDouble();
		
		System.out.println("Please enter the state tax withholding rate: ");
		double taxStRate = scan.nextDouble();
		
		double FDwhld = Math.floor(taxFdRate*wkHour*rateHour*100)/100;
		double STwhld = Math.floor(taxStRate*wkHour*rateHour*100)/100;
		double totalDdct = Math.floor((FDwhld + STwhld)*100)/100;
		double netPay = Math.floor((wkHour*rateHour - taxFdRate*wkHour*rateHour - taxStRate*wkHour*rateHour)*100)/100;
		
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+ (wkHour * 100 / 100.0));
		System.out.println("Pay Rate: $"+ rateHour);
		System.out.println("Gross Pay: $" + (float)(wkHour*rateHour));
		
		System.out.println("Deductions: ");
		System.out.println("   Federal Withholding ("+ taxFdRate*100 +"%): $"+ FDwhld);
		System.out.println("   State Withholding ("+ taxStRate*100 +"%): $"+ STwhld);
		System.out.println("   Total Deduction: $"+ taxFdRate*100 +"%): $"+ totalDdct);
		System.out.println("Net Pay: $"+ netPay);

}
}
		