package unidad3;

import java.util.Scanner;

public class Tri�ngulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud en cms. del lado 1 del tri�ngilo");
		
		int lado1 = sc.nextInt();
		
		System.out.println("Introduce la longitud en cms. del lado 2 del tri�ngilo");
		
		int lado2 = sc.nextInt();
	
		System.out.println("Introduce la longitud en cms. del lado 3 del tri�ngilo");
		
		int lado3 = sc.nextInt();
		
		if (lado1 >= 0 && lado2 >= 0 && lado3 >= 0) {
			
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				
				System.out.println("Has introducido un tri�ngulo correcto y es de tipo equil�tero");
			}
			
			if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1) {
				
				System.out.println("Has introducido un tri�ngulo correcto y es de tipo is�sceles");
			}
			
			if (lado1 != lado2 && lado2 != lado3) {
				
				System.out.println("Has introducido un tri�ngulo correcto y es de tipo escaleno");
			} 
			
		} else {
			
			System.out.println("No has introducido las medidas de un tri�ngulo correcto");
			
			}
		
		sc.close();
		
	}

}
