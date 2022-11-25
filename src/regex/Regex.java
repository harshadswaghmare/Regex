package regex;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String args[]) {
		while (true) {

			HashMap<String, String> map = new HashMap<String,String>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input value");
			String input = sc.nextLine();
			map.put("us", "United Kingdome America");
			map.put("United States", "United Kingdome America");

			if (map.containsKey(input)) {
				System.out.println(map);
				String value = input.replace(input, map.get(input));
				Pattern p = Pattern.compile(value, Pattern.CASE_INSENSITIVE);
				System.out.println("replacd value is : " + p);

			}

			else {
				System.out.println("invalid input");
				System.out.println(
						"please try following options" + "\nus or United States or CALIFORNIA or California");
			}

		}
	}

}
