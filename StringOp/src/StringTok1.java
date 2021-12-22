import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTok1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = new String();
		System.out.println("Enter a string");
		str = s.nextLine();
		StringTokenizer stzer = new StringTokenizer(str);
		System.out.println("Total words:" + stzer.countTokens());
	}

}
