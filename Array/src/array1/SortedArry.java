package array1;

import java.lang.reflect.Array;

public class SortedArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = { 50, 20, 60, 90, 10 };
		int l = num.length;
		int i, j, k;
		System.out.println("given no");
		for (i = 0; i < l; i++) {
			System.out.println(" " + num[i]);

		}
		System.out.println("\n");
		System.out.println("asscending order");
//		Array.sort(num);
		for (i = 0; i < l; i++) {
			System.out.println(" " + num[i]);
		}

	}

}
