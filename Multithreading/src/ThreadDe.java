
public class ThreadDe extends Thread {
	int i = 0;

	public void run() {
		for (; i < 10; i++) {
			System.out.println("The value is :" + i);
		}
	}
}
