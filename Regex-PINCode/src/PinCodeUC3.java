import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeUC3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// taking pincode from console n saving it in a string

		System.out.println("enter the pin code");
		String pinCode = sc.nextLine();
		final String exp = "^[0-9]{6}$";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(pinCode);

		// result whether pincode matches the pattern
		System.out.println("pin Code matches with the pattern : " + matcher.matches());

	}

}
