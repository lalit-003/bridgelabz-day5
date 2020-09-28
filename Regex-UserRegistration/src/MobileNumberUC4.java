import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberUC4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mobile number along with country code");
		// taking mobile number from console n saving it in a string

		String mobileNumber = sc.nextLine();
		final String exp = "[0-9]{2}[; ;][0-9]{10}";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(mobileNumber);

		// result whether mobile number matches the pattern
		System.out.println("mobile number matches with the pattern : " + matcher.matches());

	}
}
