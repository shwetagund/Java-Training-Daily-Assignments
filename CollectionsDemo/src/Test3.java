import java.util.*;

public class Test3 {
	public static void main(String[] args) {
// Create TreeSet
		Set<String> mySet = new TreeSet<String>();
// Add Strings
		mySet.add("Alan");
		mySet.add("Carol");
		mySet.add("Bob");
// Get Iterator
		Iterator it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}