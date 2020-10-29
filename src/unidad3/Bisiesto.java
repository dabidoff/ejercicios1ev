package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número y te diré si es bisiesto");
		
		int year = sc.nextInt();
		
		if (year %4 == 0 && year % 400 != 0) {
			
			System.out.println("El año " + year + " es bisiesto.");
		} else {
			
			System.out.println("El año " + year + " NO es bisiesto.");
			
		}
		
		sc.close();
	}

}
