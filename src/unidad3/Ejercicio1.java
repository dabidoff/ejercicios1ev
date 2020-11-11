package unidad3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String frase;
		
		int contadorA=0, contadorE=0, contadorI=0, contadorO=0, contadorU=0;
		
		int i;

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce una frase por el teclado y te cuento cuántas vocales de cada tipo tiene");
		
		frase = teclado.nextLine();
		
		for (i=0; i<frase.length(); i++) {
		
			char vocal = frase.charAt(i);
			
				switch(vocal) {
				
				case 'a':
					contadorA++;
					break;
				case 'e':
					contadorE++;
					break;
				case 'i':
					contadorI++;
					break;
				case 'o':
					contadorO++;
					break;
				case 'u':
					contadorU++;
					break;
					
				}//switch
		
		}//for
		
		System.out.println("Cantidad de a: " + contadorA);
		System.out.println("Cantidad de e: " + contadorE);
		System.out.println("Cantidad de i: " + contadorI);
		System.out.println("Cantidad de o: " + contadorO);
		System.out.println("Cantidad de u: " + contadorU);
		
		
	}//main
		
		
		
		

}//class

