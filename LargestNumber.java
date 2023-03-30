package java;

public class LargestNumber extends TakingInput {
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

	public static void main(String[] args) {
	}

}
