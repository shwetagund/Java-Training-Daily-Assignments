import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		String [ ] names = {"Ann", "Bob", "Carol"};
		// Add to arrayList
		for (int k = 0; k < names.length; k++)
		nameList.add(names[k]);
		// Display name list using an iterator
		Iterator<String> it = nameList.iterator(); // Get the iterator
		while (it.hasNext())
		// Use the iterator
		System.out.println(it.next());
		
	}

}
