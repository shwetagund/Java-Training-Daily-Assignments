import java.io.*;
import java.util.*;
public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a = new AA();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}

}
