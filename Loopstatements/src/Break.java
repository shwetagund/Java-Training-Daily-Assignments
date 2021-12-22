
public class Break {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		AAA: {
			System.out.println("block AAA");

			BBB: {
				System.out.println("Block BBB");

				CCC: {
					if (true)
						break BBB;
       
				}
				System.out.println("out of block CCC");
			}
			System.out.println("out of block BBB");

		}
		System.out.println("out of block AAA");
	}
}
