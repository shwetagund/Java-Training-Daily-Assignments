package array1;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int sum=0;
		for(int i=0;i<args.length;i++) {
    	  sum=sum + Integer.parseInt(args[i]);  //always covert string so use parseInt
    	  
      }
		System.out.println("final result:" +sum);
	}

}//go to the run configuration and enter the arguments then you will get output(1 2 3=6)
