package program;
import java.util.*;

class TakingInput{
	int size, temp, a[],max,i;
	Scanner sc = new Scanner(System.in);
	public void inputInfo() {
        System.out.print("Enter no. of elements:");
        size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter elements :");
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        } 
	}
}
class LargestNumber extends TakingInput {
    public void biggestOfThree()
    {	
        max = a[0];
        for(int i = 0; i < size; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
    }
}
class Fibonacci extends TakingInput{
	public void fibo() {
		//sc.close();
	    a[0] = 0;
	    a[1] = 1;
	    for (int i = 2; i < size; i++) {
	    	a[i] = a[i - 1] + a[i - 2]; // single traversal O(N)
	    }	
	    System.out.println("The nth fibonacci number is " + a[size - 1]);
	    
	}
}
class Ascending extends TakingInput{
    public void ascending()
    {
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < size - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[size - 1]);
    }	
}
public class HybridInheritence{
	public static void main(String args[]) {
		
		LargestNumber ln = new LargestNumber();
		ln.inputInfo();
		ln.biggestOfThree();
		
		Fibonacci fb = new Fibonacci();
		fb.inputInfo();
		fb.fibo();
		
		Ascending ac = new Ascending();
		ac.inputInfo();
		ac.ascending();
	}
}

