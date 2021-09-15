import java.util.Scanner;

public class Calculate_length_two_points {
	
	static void getVal(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of x1: ");  
		double x1 = input.nextDouble();  
		System.out.print("Enter the value of x2: ");  
		double x2 = input.nextDouble();  
		System.out.print("Enter the value of y1: ");  
		double y1 = input.nextDouble();
		System.out.print("Enter the value of y2: ");  
		double y2 = input.nextDouble();
		double a = x2 - x1;
        double b = y2 - y1;
        double length_of_line = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Length of Line : " + length_of_line);

}
}	


class Line {

	public static void main(String[] args) {
		
		Calculate_length_two_points obj3 = new Calculate_length_two_points();
		obj3.getVal();
		
		

	}

}
