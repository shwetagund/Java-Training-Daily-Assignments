
public class Polycon
{    public static void main(String[] args)
    {    Poly1 obj=new Poly1();
        // Here compiler decides that fun1(int) is to be called and "int" will be printed.
        obj.fun1(2);
        // Here compiler decides that fun1(int,int) is to be called and "int and int" will be printed.
        obj.fun1(2,3);    }
}
