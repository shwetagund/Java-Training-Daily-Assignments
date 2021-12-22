
public class StrBufReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s=new String("SHWETAGUND");
    StringBuffer stb=new StringBuffer(s);
    stb.reverse();
    
    System.out.println("reverseis:" +stb);
    System.out.println("reverseis:" +stb.capacity());
    System.out.println("charat:" +stb.charAt(3));
    System.out.println("delete 2,4:" +stb.delete(2, 4));
    System.out.println("delete cahr at:" +stb.deleteCharAt(3));
    System.out.println("insert at:" +stb.insert(2, 'R'));
    System.out.println("replace:" +stb.replace(2, 3, "sr"));
	}

}
