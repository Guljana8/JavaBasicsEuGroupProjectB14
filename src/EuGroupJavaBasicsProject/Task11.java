package EuGroupJavaBasicsProject;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// No 11. Write a program to print out duplicate elements from an Array of Strings?
        // 0 1 2 3 4 5 6
		
        String[] names = { "Jane", "Anastasiia", "Guljan", "Judith", "Diana", "Diana", "Guljan", "Adem", "Ruslan",
                "Ruslan" };// the number of elements

        for (int i = 0; i < names.length; i++)//
        {
            for (int j = i + 1; j < names.length; j++) {
                if ((names[i].equals(names[j])))

                    System.out.println("Duplicate Element is : " + names[j]);
            }
        }

	}

}
