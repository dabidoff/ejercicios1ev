package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		
		int filas, i, j, numero=1;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce el valor de n:");
		
		filas = teclado.nextInt();
		
		for(i = 1; i <= filas; i++) {
			
			for (j = 1; j <= i; j++) {
				
				System.out.print(numero++ + " ");
				
			}// fin for2
			
			System.out.println(" ");
			
		}// fin for1
		

}// fin clase
}//fin main
