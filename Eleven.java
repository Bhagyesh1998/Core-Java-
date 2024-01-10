package CJava;

import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of an array:");
		int len  = sc.nextInt();
		// declaring of an array
		int arr[]= new int[len];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Enter the marks of the student: "+i);
			arr[i]=sc.nextInt();
		}
		System.out.println("Array contents are: ");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
