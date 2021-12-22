
public class Copydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 char[] copyFrom= {'a','b','c','e','f','g','h','i'};
 char[] copyTo=new char[5];
 System.arraycopy(copyFrom,2,copyTo,0,5);
 System.out.println(new String (copyTo));
	}

}
