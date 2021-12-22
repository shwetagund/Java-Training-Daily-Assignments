
public class Conditinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x=5;
     int y=10;
     int result=0;
//     boolean b=true;
     boolean b=false;
     if((x==5) && (x<y)) {
    	 System.out.println("value of x:" +x);
     }
     if((x==y) ||(y>1)) {
    	 System.out.println("value of y:" +y);
     }
     result=b ? x:y;
     System.out.println("the return value of result:" +result);
	}

}
