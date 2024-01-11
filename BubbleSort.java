package CJava;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		int arr[] = new int[len];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("value: "+i);
			arr[i] = sc.nextInt();
		}
		System.out.println("array indexes are");
		
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
		// Logic Begins;
		int help;
		for (int i = 0; i <= len-2; i++) // we can write it also like arr.length-2
		{
			for (int j = 0; j <= len-2-i; j++) // we can write it also like arr.length-2-i
			{
				if(arr[j]>arr[j+1]) 
				{
					help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
		System.out.println("Array After Sorting");
		
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}

	}

}
