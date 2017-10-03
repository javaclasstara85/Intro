package basics1;

public class SumAllTheElementsInanArray {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,2,2,2};
		
		 int sum = 0;  
			for (int number: num) { 
				sum += sum + number;//sum += number
			}
			System.out.println("The sum of the elements");
	}
				
	

	
		
	}

		
	


