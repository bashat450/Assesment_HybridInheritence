package Assessment;
import java.util.*;

class Input{
	Scanner sc = new Scanner(System.in);
}
class LargestNumber extends Input {
    public void biggestOfThree()
    {
    	System.out.print("Enter a three number : ");
    	int x=sc.nextInt();
    	int y=sc.nextInt();
    	int z=sc.nextInt();
    	ArrayList<Integer> a = new ArrayList<>();
        a.add(x);
        a.add(y);
        a.add(z);
        System.out.println(Collections.max(a)+ " is the largest number.");
    }
}
class Fibonacci extends Input{
	public void fibo() {
		int n,i,a=0,b=0,c=1;
		System.out.print("Enter the number of n : ");
		n=sc.nextInt();
		System.out.println("The Fibonacci series is : ");
		for(i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}
}
class Ascending extends Input{
    public void ascending()
    {
    	int size, temp;
        System.out.print("Enter no. of elements you want in array:");
        size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < size; i++) 
        {
            a[i] = sc.nextInt();
        }
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
public class hybridInheritence{
	public static void main(String args[]) {
		
		LargestNumber ln = new LargestNumber();
		ln.biggestOfThree();
		
		
		Fibonacci fb = new Fibonacci();
		fb.fibo();
		
		Ascending ac = new Ascending();
		ac.ascending();
	}
}