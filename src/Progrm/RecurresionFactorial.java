package Progrm;

public class RecurresionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println(factorial(4));
	}

	private static int factorial(int i) {
	
		// TODO Auto-generated method stub
		if(i==1)
	
			return 1;
		
		 return i*factorial(i-1);
	}

}
