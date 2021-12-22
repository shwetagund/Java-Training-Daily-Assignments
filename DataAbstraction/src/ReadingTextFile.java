import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadingTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	File f = new File("C:/Users/shweta/Downloads");
//		File f = new File("/home/dr/Downloads", "users.csv");
		FileReader fr = new FileReader(f);
		LineNumberReader lnr = new LineNumberReader(fr);
		int i;
		String s;
		while ((s = lnr.readLine()) != null) {
			i = lnr.getLineNumber();
			System.out.println(i + " " + s);
		}
	}
}
