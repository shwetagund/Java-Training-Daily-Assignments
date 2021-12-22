
public class Test1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1(4,5);
        System.out.println("Before calling a="+t.a+"b="+t.b);
        t.meth(t);
        System.out.println("After calling a="+t.a+"b="+t.b);
	}

}
