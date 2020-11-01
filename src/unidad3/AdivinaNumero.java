package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int numPC = (int)(Math.random()*1000);

		Scanner teclado = new Scanner(System.in);
		
		int numUser = 0;
		
		System.out.println("He pensado un número entre 1 y 1000, adivina cuál es");
		
		while (numUser!=numPC) {
			
			numUser = teclado.nextInt();
			
			if (numUser<numPC) {
				System.out.println("El número es mayor");
			}
			
			else if (numUser>numPC) {
				System.out.println("El número es menor");
			}else {
				System.out.println("¡Has acertado! ¡Enhorabuena!");
			}

			}

		teclado.close();
		}
	}

