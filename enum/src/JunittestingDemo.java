import static org.junit.Assert.assertEquals;
 import org.junit.Test;
 
public class JunittestingDemo {
	Greatest g=new Greatest();
    @Test
    public void myTest() {
        //assertEquals(10, 10);
        assertEquals("Hello", "Hello");
    }
    
    @Test
    public void MyTest1() {
//    	Greatest g=new Greatest();
   	     int result = g.addtion(2,4);
    			assertEquals(6, result);
    }
    @Test
    public void MyTest2() {
//    	Greatest g=new Greatest();
   	     int result = g.subtraction(2,4);
    			assertEquals(-2, result);
    }
    @Test
    public void MyTest3() {
//    	Greatest g=new Greatest();
   	     int result = g.multiplication(2,4);
    			assertEquals(8, result);
    }
    @Test
    public void MyTest4() {
    	int result = g.division(10, 5);
    	assertEquals(2,result);
    }
   
}
