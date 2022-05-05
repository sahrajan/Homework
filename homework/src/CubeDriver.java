

import java.util.Scanner;

/**
 * 
 * @author shah
 *
 */

public class CubeDriver {
	
	/**
	 * 
	 * @param args - main method
	 * @cube - calling the cube class.
	 * using scanner class to let user input the sideLength 
	 * @surfaceArea - calling the methods of surfaceArea from cube class and printing the Surface Area
	 * @volume - calling the methods of surfaceArea from cube class and printing the Surface Area
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube result = new Cube(0);
		
		Scanner sc = new Scanner(System.in); // creating the scanner
		System.out.print("Enter the Length: ");
		 
		double side = sc.nextDouble();
		
		//getting the result of surface area
		double surfaceArea = result.surfaceArea(side);
		System.out.println(surfaceArea);
		
		//getting the result of volume 
		double volume = result.volume(side);
		System.out.println(volume);
		
	

	} //end of main method

} //end of class
