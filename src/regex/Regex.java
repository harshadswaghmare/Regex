package regex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Regex {

	public static void main(String args[])
	{
		List<String> list1= Arrays.asList("us","United States","CALIFORNIA","Calfornia");
		
	  while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input value");
		String input = sc.nextLine();
	   if(list1.contains(input))
		{
			 
	    	String value = input.replace(input, "United Kingdome America");
	    	
		    Pattern p = Pattern.compile(value,Pattern.CASE_INSENSITIVE);
		    System.out.println("replacd value is : "+p);
 		   
		}
	   
	   else {
		   System.out.println("invalid input");
		   System.out.println("please tried us or United States or CALIFORNIA or California");
	   }
		
		/*Pattern pattern = Pattern.compile("List1");
		Matcher matcher = pattern.matcher(input);
		boolean flag = matcher.find();
		if(flag)
		{
			String string = input.replace(input, "united Kingdome America");
		}
		else {
			System.out.println("invalid input");
			System.out.println("please tried us or United States or CALIFORNIA or California");
		}*/
		
	}
	}
	

}
