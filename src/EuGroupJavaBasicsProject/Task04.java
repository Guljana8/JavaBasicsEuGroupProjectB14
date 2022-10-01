package EuGroupJavaBasicsProject;

public class Task04 {

	public static void main(String[] args) {
		/*// Create a 2D array of integer values. 
		 * Print the sum of all numbers.
         */
		
        int[][] oddEvenNumbers = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println("Even numbers are: ");
        for (int i = 0; i < oddEvenNumbers.length; i++) {
            for (int j = 0; j < oddEvenNumbers[i].length; j++) {
                if (oddEvenNumbers[i][j] % 2 == 0) {
                    System.out.println(oddEvenNumbers[i][j]);
                }
            }
        }


	}

}
