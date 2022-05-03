import java.util.Scanner;

/**
 * The ChangeCalculator program calculates the changes in terms of given input by users.
 * we have to display the output as how many dollars bills and how many coins are in the input.
 * we are calculating how many $20 bills or $10 bills or $5 bills or $1 bills 
 * And also calculating the Quarters, Dimes, Nickels and Penny 
 * lets assume that $20 is the max bills 
 * 
 * @author shah
 */

public class ChangeCalculator {
	
	/**
	 * Create the scanner objects. 
	 * Amount enter by the user in two decimal points. 
	 * @WhileStatement - if user inputs more than two decimal points or negative numbers then it will prompt "Invalid"
	 *  - if user enter positive numbers then the code will execute .
	 * Converting the user input amount in cents by multiplying by 100.
	 * then calculating the 20 bills, by dividing by 2000 and modulus 2000 to check if there is remainder 
	 * and repeating the same pattern for 10, 5 , 1, quarter, dime, nickel, penny.
	 * then printing the result.
	 * @param args - this method is calculating the given input in how many dollars bills .... quarter or none 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);  // Create a Scanner object
		 System.out.print("Amount $");
		 
		 double amount = sc.nextDouble();

		 while(amount<0 || !(amount*100 == (int)(amount*100))){
	    	 System.out.println("Invalid");
             System.out.print("Amount $");
		     amount = sc.nextDouble();
	     }
	     
	     
		 int totalCents = (int)(amount*100); // converting dollars into cents 
		 
		 int twenty = (int) (totalCents/2000); // assuming twenty bill is the highest bill then calculating how many 
		 int dollars20 = totalCents%2000;
		 
		 int ten = dollars20/1000;
		 int dollars10 = totalCents%1000;
		 
		 int five = dollars10/500;
		 int dollars5 = totalCents%500;
		 
		 int one = dollars5/100;
		 int dollars1 = totalCents%100;
		 
		 int quarter = (int) (dollars1/25);
		 int quarter25 = (int) (totalCents%25);
		 
		 int dime = (int) (quarter25/10);
		 int dime10 = (int) (totalCents%10);
		 
		 int nickel = (int) (dime10/5);
		 int nickel5 = (int) (totalCents%5);
		 
		 int penny = (int) (nickel5);
		
		 
	// Printing the result
		 System.out.println();
		 System.out.println(twenty + " twenty dollar bills");
	     System.out.println(ten + " ten dollar bills");
	     System.out.println(five + " five dollar bills");
	     System.out.println(one + " one dollar bills");
	     System.out.println(quarter + " quarters");
	     System.out.println(dime + " dimes");
	     System.out.println(nickel + " nickles");
	     System.out.println(penny + " pennies");
	     
	 
	   sc.close();   
	} //  end of main method

} // end of class
