package CJava;

import java.util.Scanner;

public class EighteenSwapping1dArray {

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
		
		int help;
//		help = arr[1];
//		arr[1] = arr[4];
//		arr[4] = help;
		
		help = arr[2];
		arr[2] = arr[2+2];
		arr[2+2] = help; 
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	

}
