import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0;
     String s1="this is good";
     StringTokenizer st1=new StringTokenizer(s1);
     System.out.println("no of words:" +st1.countTokens());
     sum=st1.countTokens();
     while(st1.hasMoreTokens())
         sum=sum+st1.nextToken().length();
       System.out.println("No. of Chars "+sum);
	}

}
