package unidad4;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String cadena;
		
		System.out.println("Introduce la cadena");
		
		cadena = sc.nextLine();
		
		for(int i=1; i<=cadena.length(); i++) {
		
			System.out.print(cadena.charAt(cadena.length()-i));
			
		}
		
	}

}
