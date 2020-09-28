import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameUC2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last Name");
		// taking last name from console n saving it in a string

		String lastName = sc.nextLine();
		final String exp = "[A-Z]{1}[A-za-z]{2,}";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(lastName);

		// result whether last name matches the pattern
		System.out.println("last name matches with the pattern : " + matcher.matches());

	}

}
