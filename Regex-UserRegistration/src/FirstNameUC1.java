import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameUC1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the firstName");
		// taking first name from console n saving it in a string

		String firstName = sc.nextLine();
		final String exp = "[A-Z]{1}[A-za-z]{2,}";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(firstName);

		// result whether first name matches the pattern
		System.out.println("first name matches with the pattern : " + matcher.matches());

	}

}
