package array1;

abstract class AB {
	public void show() {
		System.out.println("class a is  super class");
	}

	abstract void display(int x);
}

class BC extends AB {
	public void show() {
		super.show();
		System.out.println("class b is sub class");
	}

	void display(int x) {
		System.out.println(" x is in sub class " + x);
	}
}