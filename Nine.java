package CJava;

import java.util.Scanner;

public class Nine {
    // Standardized Array
	// It is Three (3) dimensional arrays
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][][] =  new int [3][2][3];
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <= arr[i].length-1; j++) 
			{
				for (int k = 0; k <= arr[i][j].length-1; k++) 
				{
					System.out.println("No of colleges: "+i+" "+"No of Classes: "+j+" "+"No Studnets Marks: "+k);
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("Array Contents are: ");
		for (int i = 0; i <= arr.length-1; i++) 
		{
			for (int j = 0; j <=arr[i].length-1 ; j++) 
			{
				for (int k = 0;  k<= arr[i][j].length-1; k++) 
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		sc.close();
	}

}
