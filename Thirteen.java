package CJava;

import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Rows: ");
		int row = sc.nextInt();
		int arr[][] = new int[row][];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			System.out.println("Enter the column: "+i);
			int col = sc.nextInt();
			arr[i]= new int[col];
			// arr[i] = new int[sc.nextInt()]; we write like this also
		}
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				System.out.println("No of rows: "+i+" "+"No Of columns: "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array Indexes are: ");
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
