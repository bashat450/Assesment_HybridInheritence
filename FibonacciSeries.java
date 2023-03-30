package java;

public class FibonacciSeries extends TakingInput{
	public void fibo() {
	    //sc.close();
	    a[0] = 0;
	    a[1] = 1;
	    for (int i = 2; i < size; i++) {
	    	a[i] = a[i - 1] + a[i - 2]; 
	    }
	    System.out.println("The nth fibonacci number is " + a[size - 1]);
	}
	public static void main(String args[]) {
		
	}

}
