package EmailAddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailUC5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the email address");
		// taking email address from console n saving it in a string

		String email = sc.nextLine();
		final String exp =  "^([0-9a-zA-Z]{1,})([+-._][a-z0-9A-Z]{1,})*@([0-9a-zA-Z]{1,})(.[a-zA-Z]{2,4})?.([a-zA-Z]{2,3})$";

				Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(email);

		// result whether email matches the pattern
		System.out.println("email matches with the pattern : " + matcher.matches());

	}


}



//     abc@gmail.comm.aa.au

//      abc@abc@gmail.com