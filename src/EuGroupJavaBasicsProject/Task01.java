package EuGroupJavaBasicsProject;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/* 1. Using Scanner create an array of integer values. After
         * the array is created, calculate the sum of all stored
         * elements in that array.
         */

    Scanner scan=new Scanner(System.in);
    System.out.println("enter # of elements ");
    int n=scan.nextInt();

    int[] numbers=new int[n];
    System.out.println("enter all the elements");

    int sum=0;

    for(int i=0; i<n; i++) {
        numbers[i]=scan.nextInt();
        sum+=numbers[i];
    }
    System.out.println("sum:"+sum);

	}

}
