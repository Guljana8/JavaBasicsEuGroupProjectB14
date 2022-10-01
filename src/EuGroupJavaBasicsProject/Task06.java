package EuGroupJavaBasicsProject;

public class Task06 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a
        // temporary variable?

        int x = -1;
        int y = -5;

        System.out.println("Before swapping:" + " x = " + x + ", y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:" + " x = " + x + ", y = " + y);

	}

}
