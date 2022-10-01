package EuGroupJavaBasicsProject;

public class Task07 {

	public static void main(String[] args) {
		//No 7. Write a java program to check whether a given number is prime or not?


        int num = 7;
        int divisorCount = 0; 

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }

        if (divisorCount == 2) {
            System.out.println(num+" is a Prime number");
        } else {
            System.out.println(num+" is not a Prime number");
        }


	}

}
