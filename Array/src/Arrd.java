import java.util.Scanner;

public class Arrd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner con = new Scanner(System.in);
     System.out.println("enter the array no");
     int sum=0;
     int n=con.nextInt();
     int arr[]=new int[n];
     System.out.println("enter array elements");
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i]=con.nextInt();
    	 sum+=arr[i];
     }
     System.out.println("sum of arrya:" +sum);
    		 
	}

}
