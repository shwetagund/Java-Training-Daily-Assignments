package string;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "shweta gund";
		String s2 = "SHWETA";
		String s3 = "HI";

		System.out.println("String1:" + s1);
		System.out.println("String2:" + s2);
		System.out.println("String3:" + s3);
		System.out.println("String1 length:"  + s1.length());
		System.out.println("String 1 is begins with String 2:"  + s1.startsWith(s2));
		System.out.println("String 2 is ends with String 3: "  + s1.endsWith(s3));
		System.out.println("String 3 Position in Stirng 1 :"  + s1.indexOf(s2));
		System.out.println("String 1 Upper Case :"  + s1.toUpperCase());

	}

}
