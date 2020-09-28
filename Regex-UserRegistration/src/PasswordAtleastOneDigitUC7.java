import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordAtleastOneDigitUC7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the password");
		// taking password from console n saving it in a string

		String passWord = sc.nextLine();
		final String exp = "(?=.*[0-9])[0-9A-Za-z]).{8,}";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(passWord);

		// result whether password matches the pattern
		System.out
				.println("password matches with the pattern(contains lower case N UPPER CASE ) : " + matcher.matches());
	}

}
