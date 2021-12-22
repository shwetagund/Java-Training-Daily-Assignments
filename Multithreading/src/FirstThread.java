
public class FirstThread extends Thread {
	public void run() {
		System.out.println("FirstThread is running");
	}

	public void start() {
		run();
	}

	public static void main(String args[]) {
		FirstThread t = new FirstThread();
		t.start();
		System.out.println("FirstThread stopped");
	}
}
