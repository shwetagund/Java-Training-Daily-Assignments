
public class PolyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over1 obj;
        obj=new Over1(); // line 1
        obj.fun1(2);  // line 2 (prints ""int in Class A is : 2")
        obj=new Over2();  // line 3
        obj.fun1(5);  // line 4 (prints "int in Class A is : 5")
	}

}
