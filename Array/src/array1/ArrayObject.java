package array1;

public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a[] = new A[5];
		for (int i = 0; i < 5; i++) {
			a[i] = new A();
			a[i].readdata();
			a[i].printdata();
		}
	}

}
