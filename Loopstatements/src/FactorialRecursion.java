
public class FactorialRecursion {

	public static long factorial(int n) {
		if(n <=1)
	    	 return 1;
	     else
	    	 return n* factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=10;i++)
        	System.out.println(factorial(i));
	}

}
