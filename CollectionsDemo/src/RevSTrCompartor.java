import java.util.Comparator;
//own campartor file
public class RevSTrCompartor implements Comparator<String> {
	public int compare(String s1, String s2)
	{
	return - s1.compareTo(s2); // Note the negation operator
	}
}
