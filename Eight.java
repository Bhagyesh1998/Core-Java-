package CJava;

import java.util.Scanner;

public class Eight {

	// It is Two (2) dimensional " JAGGED " arrays
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int arr[][] = new int[4][];
	        // handling of an 2nd dimensional array where a[0] is "I" and new in[J] is the "J"
	        arr[0] = new int[3];
	        arr[1] = new int[5];
	        arr[2] = new int[2];
	        arr[3] = new int[4];
	        
	        for (int i = 0; i <= arr.length-1; i++) 
	        {
				for (int j = 0; j <= arr[i].length-1; j++) 
				{
					System.out.println("No Of classes: "+i+" "+"No of Student Marks: "+j);
					arr[i][j]=sc.nextInt();
				}
			}
	       
	        System.out.println("List Of Arrays Stored");
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
