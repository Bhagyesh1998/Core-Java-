package CJava;


import java.util.Scanner;

public class Ten {
	// not Standardized Array
	// It is Three (3) dimensional Jagged arrays
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][][]  =  new int[3][][];
		 
	     arr[0] =  new int[1][];
	     arr[1] =  new int[2][];                // First we have to crate 2 dimensional 
	     arr[2] =  new int[3][];
	     arr[0][0] = new int[4];
	     arr[1][0] = new int[2];
	     arr[1][1] = new int[3];                // Later connect to 3 dimensional
	     arr[2][0] = new int[3];
	     arr[2][1] = new int[4];
	     arr[2][2] = new int[2];

	     
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
						System.out.print(arr[i][j][k]+" " );
					}
					System.out.println();
				}
				System.out.println();
			}
		sc.close();
	}

}
