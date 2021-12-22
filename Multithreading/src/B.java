import java.io.*;
import java.util.*;
public class B extends Thread {
	int i;

	public void run()
	    {    System.out.println("Thread B");
	        for(i=0;i<5;i++)
	        {    
	        System.out.println("Thread B : "+i);     
//	        yield();
	        }
	    }
}
