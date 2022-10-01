package EuGroupJavaBasicsProject;

public class Task05 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program
        // which will calculate the sum of even and odd numbers
        // for that array.

        int[][] arr= {
                {1, 2, 3, 4, 0},
                {1, 2, 3, 4, 5}

        };

        int oddSum=0;
        int evenSum=0;

         for(int i=0; i<arr.length; i++) {

            for( int j=0; j<arr[i].length; j++) {

                if(arr[i][j]%2==1) {

                    oddSum+=arr[i][j];

                }else

                    evenSum+=arr[i][j];

                }

            }

            System.out.println("The sum of odd numbers is "+oddSum);
            System.out.println("The sum of even numbers is "+evenSum);
	}

}
