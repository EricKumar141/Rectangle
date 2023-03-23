import java.util.Scanner;

public class TestRectangle{
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		double length;
		double breadth;
		Rectangle userRectangles[] = new Rectangle[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Rectangle Length");
			length = Double.parseDouble(s.nextLine());
			System.out.println("Enter Rectangle Breadth");
			breadth = Double.parseDouble(s.nextLine());
			userRectangles[i] = new Rectangle(length, breadth);
		}
		
		for (int i = 0; i < 5; i++) {
			userRectangles[i].display();
		}
}
}