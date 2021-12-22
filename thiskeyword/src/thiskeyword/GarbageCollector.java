package thiskeyword;

public class GarbageCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Size = 200;
		StringBuffer s;
		for (int i = 0; i < Size; i++) {
		}
		System.out.println("GarbageCollector started explicity");
		long time = System.currentTimeMillis();
		System.gc();
		System.out.println("It took " + (System.currentTimeMillis() - time) + " ms");
	}

}
