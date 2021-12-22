import java.util.Set;
import java.util.*;
/**
This program demonstrates how to add elements
to a HashSet. It also shows that duplicate
elements are not allowed.
*/
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fruitSet = new HashSet<String>();
		fruitSet.add("Apply");
		fruitSet.add("banana");
		fruitSet.add("orange");
		fruitSet.add("pear");

		System.out.println("Here the elements");
		for (String element : fruitSet)
			System.out.println("element");
		// Try to add a duplicate element.
		System.out.println("\nTrying to add Banana to " + "the set again...");
		if (!fruitSet.add("Banana"))
			System.out.println("Banana was not added again.");
		// Display the elements in the set.
		System.out.println("\nHere are the elements once more.");
		for (String element : fruitSet)
			System.out.println(element);
	}

}
