import java.util.StringTokenizer;

public class Stoken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc def gh");
		StringTokenizer t = new StringTokenizer(s);
		System.out.println(t.countTokens());
		while (t.hasMoreTokens());
		System.out.println(t.nextToken());
	}

}
