package EuGroupJavaBasicsProject;

public class Task08 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of
        // Fibonacci series.

        int[] fibonacci = new int[10];
        int count = 10;

        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.print(fibonacci[0]);
        System.out.print(" " + fibonacci[1]);

        for (int i = 2; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(" " + fibonacci[i]);
        }
	}

}
