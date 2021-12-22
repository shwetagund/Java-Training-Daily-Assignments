import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet to hold names.
		Set<String> nameSet = new HashSet<String>();
		// Add some names to the set.
		nameSet.add("Chris");
		nameSet.add("David");
		nameSet.add("Katherine");
		nameSet.add("Kenny");
		// Get an iterator for the set.
		Iterator it = nameSet.iterator();
		// Display the elements in the set.
		
		System.out.println("Here are the names in the set.");
		while (it.hasNext())
		System.out.println(it.next());
		System.out.println();
		// Search for "Katherine". We should find this
		// name in the set.
		
		if (nameSet.contains("Katherine"))
		System.out.println("Katherine is in the set.");
		else
		System.out.println("Katherine is NOT in the set.");
		



//Search for "Bethany". We should not find
//this name in the set.
          if (nameSet.contains("Bethany"))
           System.out.println("Bethany is in the set.");
         else
          System.out.println("Bethany is NOT in the set.");

}
}

