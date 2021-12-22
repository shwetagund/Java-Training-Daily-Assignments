
public class UseStatic {
	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println("x:" + x);
		System.out.println("x:" + a);
		System.out.println("x:" + b);
	}

	static {
		System.out.println("static block");
		b = a * 4;
	}

	public static void main(String args[]) {
		meth(42);
	}
}
