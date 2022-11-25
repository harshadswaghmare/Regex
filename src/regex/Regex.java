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


//Aproach Second for replacing application


package Regex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex1 {
public static void main(String []args)
{
	while(true)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter  input");
	String input = sc.nextLine();
	String forUS="(([Cc]alifornia|us|US|CALIFORNIA))";
	String forIndia ="(?i)IND|india";
    String afg ="(?i)AFG";
	Pattern pattern = Pattern.compile("",Pattern.CASE_INSENSITIVE|Pattern.DOTALL|Pattern.MULTILINE);
	Matcher matcher = pattern.matcher(input);

	if(pattern.matches(forUS, input)) 
	{
      String valueString = input.replaceAll(input, "United States of America");
      System.out.println(valueString);
    }
	
	else if(pattern.matches(forIndia, input))
	{
		String valueString = input.replaceAll(input, "India");
	    System.out.println(valueString);
	}
    
	else if(pattern.matches(afg,input))
	{
		String valueString = input.replaceAll(input, "Afghanistan");
	    System.out.println(valueString);
	}
    else{
    	System.out.println("please enter valid one");
    	System.out.println("for india ener INDIA or IND or india");
    	System.out.println("for US enter CALIFORNIA or california or us or US");
    	System.out.println("for Afganistan Enter AFG");
    	
    }
	
	
	}
  }
}



