
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     float area;
     
     TwoCLasses Rectangle = new TwoCLasses();
     Rectangle.getdata(5,5);
     area = Rectangle.length * Rectangle.breadth;
     System.out.println("Area : "+area);
	}

}
