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


//_______________________________________________________________________________________________________________________________________________________


//Regex for Job Description


package Regex1;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JobDescriptionRegex {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter  input");
			String input = sc.nextLine();
			String forAccountRepresentative = "(?i)ACCOUNT REPRESENTATIVE";
			String forAccountant1 = "((?i)ACCOUNTANT) I";
			String forAccountant2 = "((?i)ACCOUNTANT) II";
			String forAcCordAMCO = "(?i)Accounting Coordinator-Amco";
			String forAccPayCleark = "(?i)ACCOUNTS PAYABLE CLERK";
			String forActuarialAnalyst = "(?i)ActuarialAnalyst";
			String forActuary = "(?i)ACTUARY";
			String forAdminSvcsCoordI = "(?i)ADMIN SVCS COORD I";
			String forAdmin = "(?i)ADMIN";
			String forAdministrativeclerk = "(?i)ADMINISTRATIVE CLERK";
			String forAideHomeHealthString = "(?i)AIDE,HOME HEALTH";
			String forAnalyst = "(?i)ANALYST";
			String forAnalystData = "(?i)ANALYST,DATA";
			String forAudiologi = "(?i)AUDIOLOGIST";
			String forBsF = "(?i)BS&F Anl";
			String forBsFConslt = "(?i)BS&F Conslt";
			String forbehavioralMedSpecLcsw = "Behavioral Medicine Spec LCSW|Behavioral Medicn Spec(LCSW)|Behavioral Medicn Spec(lcsw)";
			String forBehavioralMedPsych = "(?i)BEHAVIORAL MED SPEC \\(PSYCH\\)";
			String forLabAssistant1 = "((?i)LAB ASST) I";
			String forLabAssistant2 = "((?i)LAB ASST) II";

			if (Pattern.matches(forAccountRepresentative, input.trim())) {
				System.out.println(input.replaceAll(input, "Account Representative"));
			}

			else if (Pattern.matches(forAccountant1, input.trim())) {
				System.out.println(input.replaceAll(input, "Accountant I"));
			}

			else if (Pattern.matches(forAccountant2, input.trim())) {
				System.out.println(input.replaceAll(input, "Accountant II"));

			} else if (Pattern.matches(forAcCordAMCO, input.trim())) {
				System.out.println(input.replaceAll(input, "Accounting Coordinator - AMCO"));
			}

			else if (Pattern.matches(forAccPayCleark, input.trim())) {
				System.out.println(input.replaceAll(input, "Accounts Payable Clerk"));

			} else if (Pattern.matches(forActuarialAnalyst, input.trim())) {
				System.out.println(input.replaceAll(input, "Actuarial Analyst"));
			}

			else if (Pattern.matches(forActuary, input.trim())) {
				System.out.println(input.replaceAll(input, "Actuary"));
			}

			else if (Pattern.matches(forAdminSvcsCoordI, input.trim())) {
				System.out.println(input.replaceAll(input, "Admin Svcs Coord I"));

			} else if (Pattern.matches(forAdmin, input.trim())) {
				System.out.println(input.replaceAll(input, "Admin"));

			} else if (Pattern.matches(forAdministrativeclerk, input.trim())) {
				System.out.println(input.replaceAll(input, "Administrative Clerk"));

			} else if (Pattern.matches(forAideHomeHealthString, input.trim())) {
				System.out.println(input.replaceAll(input, "Aide,Home,Health"));

			} else if (Pattern.matches(forAnalyst, input.trim())) {
				System.out.println(input.replaceAll(input, "Analyst"));

			} else if (Pattern.matches(forAnalystData, input.trim())) {
				System.out.println(input.replaceAll(input, "Analyst,Data"));

			} else if (Pattern.matches(forAudiologi, input.trim())) {
				System.out.println(input.replaceAll(input, "Audiologist"));

			} else if (Pattern.matches(forBsF, input.trim())) {
				System.out.println(input.replaceAll(input, "BS&F Analyst"));

			} else if (Pattern.matches(forBsFConslt, input.trim())) {
				System.out.println(input.replaceAll(input, "BS&F Consultant"));

			} else if (Pattern.matches(forbehavioralMedSpecLcsw, input.trim())) {
				System.out.println(input.replaceAll(input, "Behavioral Medicine Spec (LCSW)"));
			
			} else if (Pattern.matches(forBehavioralMedPsych, input.trim())) {
				System.out.println(input.replaceAll(input, "Behavioral Medicine Spec (Psych)"));

			} else if (Pattern.matches(forLabAssistant1, input.trim())) {
				System.out.println(input.replaceAll(input, "Lab Assistant I"));

			} else if (Pattern.matches(forLabAssistant2, input.trim())) {
				System.out.println(input.replaceAll(input, "Lab Assistant II"));

			}

			else {
				System.out.println("Null");
				System.out.println("Please enter valid input");

			}
		}

	}

}


