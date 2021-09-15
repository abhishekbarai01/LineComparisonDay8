import java.util.Scanner;

public class Calculate_length_two_points {
	
	static void getVal(){

		Scanner sc = new Scanner(System.in);
		System.out.println("Value of x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Value of x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Value of y1: ");
		double y1 = sc.nextDouble();
		System.out.println("Value of y2: ");
		double y2 = sc.nextDouble();

		double a = x2 - x1;
		double b = y2 - y1;

		System.out.println("Value of m1: ");
		double m1 = sc.nextDouble();
		System.out.println("Value of m2: ");
		double m2 = sc.nextDouble();
		System.out.println("Value of n1: ");
		double n1 = sc.nextDouble();
		System.out.println("Value of n2: ");
		double n2 = sc.nextDouble();

		double p = m2 - m1;
		double q = n2 - n1;

		double length_of_line1 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		double length_of_line2 = Math.sqrt(Math.pow(p, 2) + Math.pow(q, 2));
		if (length_of_line1 == length_of_line2){
			System.out.println("length of both line is equal");
		}
		else if (length_of_line1 > length_of_line2){
			System.out.println("length_of_line1 is greater than length of line 2");
		}
		else {
			System.out.println("length_of_line1 is smaller than length of line 2");
		}
}
}	


class Line {

	public static void main(String[] args) {
		
		Calculate_length_two_points obj3 = new Calculate_length_two_points();
		obj3.getVal();
		
		

	}

}
