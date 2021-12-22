package array1;

//import array1.Shape.Hexagon;
//import array1.Shape.Trapezoid;
//import array1.Shape.Triangle;

public class AbShape {
	public static void main(String[] args) {
		Shape s;
		s = new Trapezoid();
		s.numberOfSides();
		s = new Hexagon();
		s.numberOfSides();
		s = new Triangle();
		s.numberOfSides();
	}
}