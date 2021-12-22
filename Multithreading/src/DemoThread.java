
public class DemoThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread obj= Thread.currentThread();
    System.out.println("current=" +obj);
    obj.setName("SHWETA");
    obj.setPriority(7);
    System.out.println("After="+obj);
	}

}
