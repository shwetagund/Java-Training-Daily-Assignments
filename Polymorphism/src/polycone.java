
public class polycone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{   
			A obj=new A();
        // Here compiler decides that fun1(int) is to be called and "int" will be printed.
        obj.fun1(2);
        // Here compiler decides that fun1(int,int) is to be called and "int and int" will be printed.
        obj.fun1(2,3);    
		}
		
		
	}

}
