package springCorebasicImplemenation;

public class Rectangle implements Shape {
	private double width, height;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public double valume() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	
	
	
	
}
