package java;

public class AscendingOrder extends TakingInput{
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
	public static void main(String args[]) {
		
	}

}
