
public class Meth1 {
	public void m() {
		System.out.println("Meth1.m()");
	}
}

class Meth extends Meth1
{
	public void m(int x) {
		System.out.println("m(int x)");
	}

	public void m(String y) {
		System.out.println("m(String y)");
	}
}
