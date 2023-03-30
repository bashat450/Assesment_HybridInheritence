package java;

import java.util.Scanner;

public class TakingInput {
	int size, temp, a[],max,i;
	Scanner sc = new Scanner(System.in);
	public void inputInfo() {
        System.out.print("Enter no. of elements:");
        size = sc.nextInt();
        a = new int[size];
        System.out.println("Enter elements :");
        for(i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        } 
	}

}
