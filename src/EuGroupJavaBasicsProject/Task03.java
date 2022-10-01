package EuGroupJavaBasicsProject;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * . Create a 2D array of integer values. Print the sum of all numbers.
		 */
		
		int [] [] arr= {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100}
        };

		  int sum=0;

	        for(int[] ar:arr) {

	            for(int num:ar) {
	                sum+=num;

	            }

	        }
	        System.out.println(sum);

	}

}
