package basics1;

import java.util.Scanner;

public class CircleAreaCircumference {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		System.out.println("Please enter radius:");
		double radius = new Scanner(System.in).nextDouble();
		
		System.out.println("The area is " + calculateArea( radius));
	
	
		System.out.println("The circumference is" + calculateCircumference(radius));}
		

	private static String calculateCircumference(double radius) {
		// TODO Auto-generated method stub
		return null;
	}


	static double  calculateArea(double radius) {
			
		return 2 * Math.PI * radius; 
		}
}