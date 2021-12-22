

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="SVCE";
		   String s2=s1;
		   String s5="SVCE";
		   String s3=new String("SVCE");
		   String s4=new String("SVCE");
		   
		   System.out.println("==compare:" +(s1==s5));
		   System.out.println("==compare:" +(s1==s2));
		   
		   System.out.println("using equals:" +s1.equals(s2));
		   
		   System.out.println("==compare:" +(s3==s4));
		   System.out.println("using equals:" +s1.equals(s4));
		   
	}

}
