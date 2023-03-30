package java;

public class Main extends TakingInput{
	public static void main(String args[]) {
		LargestNumber ln = new LargestNumber();
		ln.inputInfo();
		ln.biggestOfThree();
		
		FibonacciSeries fb = new FibonacciSeries();
		fb.inputInfo();
		fb.fibo(); 
		
		AscendingOrder ac = new AscendingOrder();
		ac.inputInfo();
		ac.ascending();
		
	}


}
