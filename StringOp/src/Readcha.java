import java.util.Scanner;

public class Readcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = new String();
		System.out.println("enter a string");
		str = s.nextLine();
		StringBuffer stb = new StringBuffer(str);
		stb.reverse();
		if (stb.toString().equals(str))
			System.out.println("given String is Palindrome");
		else
			System.out.println("given string is not Palindrome");
	}

}
