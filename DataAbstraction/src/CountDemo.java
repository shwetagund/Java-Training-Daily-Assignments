import java.io.FileReader;

public class CountDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("C:\\Users\\shweta\\Desktop");
        int l,w,ch;
        l=w=ch=0;
        int c;
        while((c=f.read())!=-1)
        {    if(c==' ')
                w++;
            else if(c=='\n')
            {    l++; w++;
            }
            else
                ch++;
        }
System.out.println("Lines: "+l+" Words:"+w+"  Characters:"+ch);
    }
}
