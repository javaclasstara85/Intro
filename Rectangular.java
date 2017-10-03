package basics1;

import java.util.Scanner;

public class Rectangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 System.out.println("Please enter height");
	 System.out.println("Please enter width");
	 
	 double width = new Scanner (System.in).nextDouble();
 double height = new Scanner (System.in).nextDouble();
 
 System.out.println("The perimeter is" + calculateperimeter(height,width));
 
 System.out.println("The perimeter is" + calculateperimeter(width, height));
	}

	static double calculatedarea(double height, double width) {
	return height * width;
	}

static double calculateperimeter(double height, double width) {
	
	return 2 * (height * width);
}
}