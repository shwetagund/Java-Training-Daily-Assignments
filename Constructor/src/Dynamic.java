
public class Dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X a = new X();
		Y b = new Y();
		Z c = new Z();
		X r; // obtains a reference of type A
		r = a;
		r.callme();
		r = b;
		r.callme();
		r = c;
		r.callme();
	}

}
