package EuGroupJavaBasicsProject;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		  /*
		  * Using Scanner create an array of countries. 
		  * When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).
		  */
		
		Scanner countries = new Scanner(System.in);

        System.out.println(
                "Select  1 Country from this list: Ethiopia, Egypt, Kenya, Germany, Turkiye, Moldova, Ukraine");

        String[] countriessEntered = new String[1];

        for (int i = 0; i <1; i++) {

            countriessEntered[i] = countries.nextLine();
        }

        countries.close();

        for (int i = 0; i < countriessEntered.length; i++) {
            switch (countriessEntered[i]) {
            case "Ethiopia":
                System.out.println("Capital city of Ethiopia is " + "Addis Ababa");
                break;
            case "Egypt":
                System.out.println("Capital city of Egypt is " + "Cairo");
                break;
            case "Kenya":
                System.out.println("Capital city of Kenya is " + "Nairobi");
                break;
            case "Germany":
                System.out.println("Capital city of Germany is " + "Berlin");
                break;
            case "Moldova":
                System.out.println("Capital city of Moldova is " + "Chisinau");
                break;
            case "Turkiye":
                System.out.println("Capital city of Turkiye is " + "Ankara");
                break;
            case "Ukraine":
                System.out.println("Capital city of Ukraine is " + "Kyiv");
                break;
            default:
                System.out.println((i + 1) + ".  country is not on the list.");
                break;
            }
        }
 
        for (String countrySecond : countriessEntered) {
            switch (countrySecond) {
            case "Ethiopia":
                System.out.println("Capital city of Ethiopia is " + "Addis Ababa");
                break;
            case "Egypt":
                System.out.println("Capital city of Egypt is " + "Cairo");
                break;
            case "Kenya":
                System.out.println("Capital city of Kenya is " + "Nairobi");
                break;
            case "Germany":
                System.out.println("Capital city of Germany is " + "Berlin");
                break;
            case "Moldova":
                System.out.println("Capital city of Moldova is " + "Chisinau");
                break;
            case "Turkiye":
                System.out.println("Capital city of Turkiye is " + "Ankara");
                break;
            case "Ukraine":
                System.out.println("Capital city of Ukraine is " + "Kyiv");
                break;
            default:
                System.out.println("Country is not on the list.");
                break;
            }
        }
	}

}
