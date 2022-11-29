package Regex1;


import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex1 {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter  input");
			String input = sc.nextLine();
			String forUS = "((?i)us|california)$";
			String forIndia = "(?i)IND|india";
			String forUK = "(?i)UK";
			String forCameroon ="(?i)cameroon";
			String forTrinidadTRO = "(?i)TrinidadTRO";
			String forAfg = "(?i)AFG";
			String forARG = "(?i)ARG";
			// String country = "[^+0-9\n]+[^(?:\s+0-9)*]";
			// String demo ="[a-zA-Z\s]|";

			if (Pattern.matches(forUS, input.trim())) {
				String valueString = input.replaceAll(input, "United States of America");
				System.out.println(valueString);
			}

			else if (Pattern.matches(forIndia, input.trim())) {
				String valueString = input.replaceAll(input, "India");
				System.out.println(valueString);
			}

			else if (Pattern.matches(forCameroon, input.trim())) {
				String valueString = input.replaceAll(input, "Cameroon");
				System.out.println(valueString);
			}
			else if (Pattern.matches(forUK, input.trim())) {
				String valueString = input.replaceAll(input, "United Kingdom");
				System.out.println(valueString);
			}
			else if (Pattern.matches(forTrinidadTRO, input.trim())) {
				String valueString = input.replaceAll(input, "Trinidad");
				System.out.println(valueString);
			}

			else if (Pattern.matches(forAfg, input.trim())) {
				String valueString = input.replaceAll(input, "AFG");
				System.out.println(valueString);
			}
			
			else if (Pattern.matches(forARG, input.trim())) {
				String valueString = input.replaceAll(input, "Argentina");
				System.out.println(valueString);
			}
			
        	else {
				System.out.println("Null");
				System.out.println("Please enter valid input");
				
				int option;
				try {
					System.out.println("for which country you want to enter data");
					System.out.println("1.India" + "\n2.Us or California" + "\n3.Afganistan");
					option = sc.nextInt();
					switch (option) {
					case 1:
						System.out.println("Enter ind,IND,INDIA ");
						break;
					case 2:
						System.out.println("Enter us or california or US or CALIFORNIA ");
						break;
					case 3:
						System.out.println("Enter AFG ");
						break;
					
					default : System.out.println("invalid match");
					}

				} catch (Exception e) {
					System.out.println("enter valid input");
					
				}

			}
		}
	}
}
