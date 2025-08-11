package corejava;
// abstract class
 abstract class Shape {
	 // abstract method
	abstract double getArea() ;
 }
 // sub class circle
 class Circle extends Shaped { // inherits from Shaped abstract class
	 double radius; // instance variable
	 Circle(double radius) { // constructor
		 this.radius=radius;
		 
	 }
	 double getArea() {
		 return Math.PI * radius * radius; // area of the circle formula
	 
	 
		
	}
}
 // sub class rectangle 
class Rectangle extends Shaped { //inherits from Shaped abstract class
	double length, width; // instance variables
		Rectangle(double length, double width) { // constructor
			this.length = length;
			this.width = width;
		}
		double getArea() {
			 return length * width; //area of the rectangle formula
		}
}

// main class		
	public class Shaped {
	public static void main(String[] args) {
		Circle obj = new Circle(5);
		Rectangle  obj1 = new Rectangle (4, 6);
		obj.getArea();
		obj1.getArea();
		 System.out.println("Area of the circle is " + obj.getArea() );
	System.out.println("Area of theb rectangle is " + obj1.getArea() );
	}
}
	


