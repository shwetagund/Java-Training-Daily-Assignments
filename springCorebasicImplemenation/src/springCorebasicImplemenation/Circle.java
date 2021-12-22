package springCorebasicImplemenation;

public class Circle implements Shape {
	private double radius;
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double valume() {
		// TODO Auto-generated method stub
		return radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	
}
