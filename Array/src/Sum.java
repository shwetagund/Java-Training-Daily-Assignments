
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = new int[10];
		for (int i = 0; i < x.length; i++)
			x[i] = i;
		int sum = 0;
		for (int i = 0; i < x.length; i++)
			sum += x[i];
		System.out.println(x[0]);
		System.out.println(sum);
	}

}
