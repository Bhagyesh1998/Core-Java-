package CJava;

    public class Two{
	public static void main(String[] args) {
		String s = "Kodnest";
		for (int i = 1; i <= 5; i++) 
		{
			System.out.println(s);
		}
		
		System.out.println();
		for (int j = 1; j <=5; j++) 
		{
			System.out.print("$");
		}
		System.out.println();
		
		for (int k = 1; k <= 5; k++) 
		{
			System.out.print(k);
		}
		System.out.println();
		
		String z = "$";
		for (int l = 1; l <=5; l++)
		{
			
		for (int m = l ; m <=5 ; m++)
		{
			System.out.print(z);
		}
		System.out.println();
		}
		
		System.out.println();
		String p = "$";
		for(int n=1;n<=5;n++) 
		{
			for(int o=1;o<=5;o++) 
			{
				System.out.print(p);
			}
			System.out.println();
		}
		
		System.out.println();
		for (int q = 1; q <= 5; q++) 
		{
			for (int r = 1; r <= 5; r++) 
			{
				System.out.print(r);
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print("$");
				
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10; j++) 
			{		
				
				System.out.print("+");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= 5; j++) 
			{
				for (int k = 1; k <= 5; k++) 
				{
					System.out.print(" ");
				}
				System.out.print("+");
			}
			System.out.println();
		}
	}
}

