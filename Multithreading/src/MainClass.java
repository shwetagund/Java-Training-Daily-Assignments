
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadName tc1 = new ThreadName("welcome");
		ThreadName tc2 = new ThreadName("SVCE");
		Thread t1 = new Thread(tc1);
		Thread t2 = new Thread(tc2);
		t1.start();
		t2.start();
	}

}
