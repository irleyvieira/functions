import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		
		y = new Triangle();
		
		System.out.println("Enter the measures of triangule X:");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Enter the measures of triangle Y:");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
	
		System.out.printf("Triangle X area: %.4f%n" ,areaX);
		System.out.printf("Triangle Y area: %.4f%n" ,areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else if(areaX == areaY){
			System.out.println("X and Y have the same area");
			
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		scan.close();

		}	
	}
	


