package test3;

public class Factorial {
	
	public int calculate(int number) {
		int result = 0;
		
		if(number==1) {
			return 1;
		}
		try {
			result = number * calculate(number-1);
		}catch(StackOverflowError e) {
			System.out.println("StackOverflow Exception");
			e.getMessage();
		}
		return result;
	}
}
