
public class Rectangle {
	private double length;
	private double breadth;
	
	Rectangle(){
		this.setBreadth(0);
		this.setLength(0);
	}
	
	Rectangle(double _length, double _breadth){
		this.setBreadth(_breadth);
		this.setLength(_length);
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double area() {
		return this.getLength() * this.getBreadth();
	}
	
	public void display() {
		System.out.println("Length = " + this.getLength());
		System.out.println("Breadth = " + this.getBreadth());
		System.out.println("Area = " + this.area());
	}
}
