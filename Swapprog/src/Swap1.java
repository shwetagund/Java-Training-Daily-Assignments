import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap1 {
	int x, y;

	public void readxy() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the values for x and y");
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
	}

	public void swapwot() {
		x = x + y;
		y = x - y;
		x = x - y;
	}

	public void swapwt() {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	public void display() {
		System.out.println("value of x: " + x + "  value of y: " + y);
	}
}
