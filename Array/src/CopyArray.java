import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Before (original)\t%s%n", Arrays.toString(args));
    		String copy[] = Arrays.copyOf(args, 4);
            System.out.printf("Before (copy)\t\t%s%n", Arrays.toString(copy));
	     copy[0]="A";
	     copy[1]="B";
	     copy[2]="C";
	     copy[3]="D";
	     System.out.printf("After (original)\t%s%n", Arrays.toString(args));
         System.out.printf("After (copy)\t\t%s%n", Arrays.toString(copy));
	    		 
	
	}

}
