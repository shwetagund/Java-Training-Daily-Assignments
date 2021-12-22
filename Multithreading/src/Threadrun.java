
public class Threadrun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread();
		td.start();
		for (int j = 0; j < 10; j++) {
			System.out.println("The value in main: " + j);
		}
	}

}
