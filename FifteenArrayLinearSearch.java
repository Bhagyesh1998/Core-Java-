package CJava;

import java.util.Scanner;

public class FifteenArrayLinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len =sc.nextInt();
		int[] arr = new int[len];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Value: "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the key to search");
		int key =sc.nextInt();
		for (int i = 0; i <= arr.length-1; i++) 
		{
			if(key == arr[i]) 
			{
				System.out.println("Array found in index of: "+i);
				System.exit(0);
			}
			
		}
		System.out.println("Key is not found");
	}
	
}
