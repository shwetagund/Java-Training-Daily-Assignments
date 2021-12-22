
public class ConstructDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConDemo c1 = new ConDemo(); // explicit call to default cons.
		ConDemo c2 = new ConDemo(5); // explicit call to parameterized cons.
		ConDemo c3 = new ConDemo(1, 2, 3); // explict call to parameterized cons.
		ConDemo c4 = new ConDemo(c3); // implicit call to copy cons.
		c1.sum();
		c2.sum();
		c3.sum();
		c4.sum();
	}

}
