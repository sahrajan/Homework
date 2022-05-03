/**
 * 
 * @author shah
 *
 */

public class Cube {
	
	/**
	 * 
	 * @param sideLength - double sideLength
	 */
	
	public Cube(double sideLength) {
		
		sideLength = 0.0;
		
		
	} // end of cube method 
	
	/**
	 * 
	 * @param side ,calculating the double surfaceArea by multiplying 6* side * side
	 * @return surfaceArea
	 */
	
	public double surfaceArea(double side) {
		
		// 
		 double surfaceArea = 6 * side * side;
		 return  surfaceArea;
		 
	} //end of surfaceArea method
	
	/**
	 * 
	 * @param side ,calculating the double volume by multiplying 6* side * side
	 * @return volume
	 */
	
	public double volume(double side) {
		
		double volume = side * side * side;
		return volume;
		
	} //end of volume method
} //end of class
