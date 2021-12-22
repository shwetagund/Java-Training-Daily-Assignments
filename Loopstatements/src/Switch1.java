
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 30;
		int status = -1;

		if (a > b && a > c) {
			status = 1;

		} else if (b > c) {
			status = 2;
		} else {
			status = 3;
		}
		switch (status) {
		case 1:
			System.out.println("a is the gretest:");
			break;
		case 2:
			System.out.println("b is the gretest:");
			break;
		case 3:
			System.out.println("c is the gretest:");
			break;
		default:
			System.out.println("not determine");

		}

	}

}
