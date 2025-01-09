import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		double a = leitor.nextDouble();
		double b = leitor.nextDouble();
		double c = leitor.nextDouble();
		
	
		double higher = max(a, b, c);
		
		showResult(higher);
		
		}
	
	
	
	public static double max(double x, double y, double z) {
		double aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(double value) {
		System.out.println("Higher: " + value );
	}
		
	}
	


