package inheritance;

public class Dog extends Animal {

	public void fun2(int  x, int  y)
    {   
		fun1(6);        // prints "int in A"
        System.out.println("Int in B is :" + x + " and " + y);
    }

	
}
