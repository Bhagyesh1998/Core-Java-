package CJava;

import java.util.Scanner;

// It is Two (2) dimensional arrays

public class Seven {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				System.out.println("Enter the marks of class"+i+"And Students "+j);
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Array Contents are");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
    }
}
