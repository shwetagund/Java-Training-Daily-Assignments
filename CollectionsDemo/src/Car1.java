import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Car1 {
	public static void main(String[] args) {
		Set<Car> carSet = new HashSet<Car>();
		Car[] myRides = { new Car("TJ1", "Toyota"), 
				new Car("GM1", "Corvette"), 
				new Car("TJ1", "Toyota Corolla") };
// Add the cars to the HashSet
		for (Car c : myRides)
			carSet.add(c);
// Print the list using an Iterator
		Iterator it = carSet.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}
