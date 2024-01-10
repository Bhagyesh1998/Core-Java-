
package CJava;

import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        int arr[] = new int[10];
            arr[0]=10;
            arr[1]=20;
            arr[2]=30;
            arr[3]=40;
            arr[4]=50;
            arr[5]=60;
            arr[6]=70;
            System.out.println(arr[0]);
            System.out.println(arr[5]);
            System.out.println(arr[3]);


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter b value");
            int b = sc.nextInt();
            sc.close();
            System.out.println("value is: "+b);  
    }
}
