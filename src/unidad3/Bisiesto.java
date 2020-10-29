package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero y te dir� si es bisiesto");
		
		int year = sc.nextInt();
		
		if (year %4 == 0 && year % 400 != 0) {
			
			System.out.println("El a�o " + year + " es bisiesto.");
		} else {
			
			System.out.println("El a�o " + year + " NO es bisiesto.");
			
		}
		
		sc.close();
	}

}
