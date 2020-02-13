import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 0;
		double area;
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter the radius of the circle:");
		radius = scn.nextDouble();
		
		area = calc_area(radius, null);
		
		System.out.println("Area of the circle: " + area);

		
		scn.close();
	}

	private static double calc_area(double radius, Object newParam) {
		// TODO Auto-generated method stub
		double area = Math.PI * radius * radius;
		return area;
	}
	
	
	private static double calcArea(String radius) {
		// TODO Auto-generated method stub
		double area = Math.PI * Double.parseDouble(radius) * Double.parseDouble(radius);
		return area;
	}

}
