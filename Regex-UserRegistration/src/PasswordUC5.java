import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUC5 {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the password");
	// taking password from console n saving it in a string

	String passWord = sc.nextLine();
	final String exp = "[0-9A-Za-z]{8,}";
	Pattern pattern = Pattern.compile(exp);
	Matcher matcher = pattern.matcher(passWord);

	// result whether password matches the pattern
	System.out.println("first name matches with the pattern : "+matcher.matches());
}
}