
public class ThreadName implements Runnable{
	int x;
	String name;

	public ThreadName(String n)
    {    name=n;
    }

	public void run() {
		for (x = 0; x < 10; x++) {
			System.out.println(name);
		}
	}
}
