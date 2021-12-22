public class Callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test t=new Test();
        int a=4,b=7;
        System.out.println("before a="+a+"b="+b);
        t.meth(a,b);
        System.out.println("after calling a="+a+"b="+b);
	}

}
