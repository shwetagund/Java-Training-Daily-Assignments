import java.util.Scanner;

public class StrbLength {
      static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new String();
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("java");
		StringBuffer sb3 = new StringBuffer(40);
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		s = scn.nextLine();
		System.out.println("  " + s);
		System.out.println("length:" + s.length());
		System.out.println("capacity:" + sb1.capacity());
		System.out.println("capacity:" + sb2.capacity());
		System.out.println("capacity:" + sb3.capacity());
	}

}
