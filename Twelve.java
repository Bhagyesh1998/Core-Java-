package CJava;

import java.util.Scanner;

public class Twelve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int row =sc.nextInt();
		System.out.println("Enter the Coloums: ");
		int col =sc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				System.out.println("Rows are: "+i+" "+"Coloums are: "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Arrays indexes are: ");
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
