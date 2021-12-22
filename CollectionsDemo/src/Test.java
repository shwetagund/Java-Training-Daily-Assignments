import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		String[] names = { "shweta", "gund", "shraddha" };
//Add to arrayList
		for (int k = 0; k < names.length; k++)
			nameList.add(names[k]);
//Display name list
		for (int k = 0; k < nameList.size(); k++)
			System.out.println(nameList.get(k));
	}

}
