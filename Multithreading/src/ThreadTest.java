
public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo td = new ThreadDemo();
		td.start();
		for (int j = 0; j < 10; j++) {
			try {
				td.sleep(5000);
			} catch (Exception e) {
			}
			System.out.println("Main Thread:" + j);
		}

	}

}
