
public class ConDemo {
	 int x,y,z;
	 ConDemo() { x=y=z=1; }   // default constructor
	 ConDemo(int a) { x=y=z=a; }     // parameterized constructor
	 ConDemo(int p,int q,int r) { x=p; y=q; z=r; }   // param. Constructor
	 ConDemo(ConDemo p) {x = p.x; y=p.y;  z=p.z; } //copy constructor
     void sum()
     {    System.out.println("sum of the values:"+ (x+y+z));
     }
   
}
