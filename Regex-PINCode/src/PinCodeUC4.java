import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeUC4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the pin code");
		// taking pincode from console n saving it in a string

		String pinCode = sc.nextLine();
		final String exp = "^([0-9]{3})[; ;]{0,1}([0-9]{3})$";
		// final String exp = "[1-9]{1}[0-9]{2}[\\s-]{0,1}[0-9]{3}";
		Pattern pattern = Pattern.compile(exp);
		Matcher matcher = pattern.matcher(pinCode);

		// result whether pincode matches the pattern
		System.out.println("pin Code matches with the pattern : " + matcher.matches());

	}

}
