package CJava;

import java.util.Scanner;

public class Fourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Array Size: ");
		int len = sc.nextInt();
		int[] arr1 = new int[len];
		System.out.println("Enter array contents");
		for (int i = 0; i <= arr1.length-1; i++) 
		{
			System.out.println("Array Box :"+i);
			arr1[i]=sc.nextInt();
		}
		// Copying array
		  int[] arr2 = new int[arr1.length];
		// copying array contents;
		  for (int i = 0; i <= arr1.length-1; i++) 
		  {
			// here i is the variable we only assigning to the arr1 and arr2
			arr2[i] = arr1[i];
		  }
		
		for (int i = 0; i <= arr1.length-1; i++) 
		{
			System.out.print(arr1[i]+" ");
		}		
		System.out.println();
		for (int i = 0; i <= arr2.length-1; i++) 
		{
			System.out.print(arr2[i]+" ");
		}
	}

}
