import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("a special test case")
public class DisplayNameDemo {

	@Test
	@DisplayName("test names displayed")
	public void testWithDisplayNameSpaces() {
		Assert.assertEquals(false, false);
	}
	
	@Test
	@DisplayName("Shweta gund")
	public void testWithDisplayNameCharacters() {
		List<String> list=new ArrayList();
		list.add("shraddha");
		list.add("gund");
		List<String> list1=list;
		Assert.assertEquals(list,list1);
	}
	
	@Test
    @DisplayName("")
   public void testWithDisplayNameContainingEmoji() {
    String[] name= {"shweta","Gund"};
    String [] name1=name;
    assertEquals(name,name1);
	}
}
