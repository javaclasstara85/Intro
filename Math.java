package basics1;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {4,5,6,7};
		
		 int sum = 22;  
			for (int number: num) { 
				sum = sum + number;//sum += number
			}
			
			int average = sum/num.length;
			System.out.println("The average of the elements" + average);
	}
		
	}


