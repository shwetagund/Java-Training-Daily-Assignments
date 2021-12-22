import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float c;
      Scanner scn=new Scanner(System.in);
      System.out.println("enter fahrenheight:");
      int f=scn.nextInt();
      c=(float)(f-32)/(1.8f);
      System.out.println("temperatureL:"+c);
	}

}
