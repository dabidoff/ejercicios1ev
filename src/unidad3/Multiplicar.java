package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("¿Qué tabla deseas aprender?");
			
			int tabla = teclado.nextInt();
			
			if (tabla<1 || tabla>=10) {
				System.out.println("Introduce un número entre 1 y 9");
			}else {
			
				int fallar = 0;
				
			for(int i =1; i<=10; i++) {
				
				int resultado = tabla*i;
				
				System.out.print(tabla + " x " + i + " = ");
				
				int valor = teclado.nextInt();
				
				if(valor != resultado) {
					
					System.out.println("Has fallado. La respuesta correcta es " + resultado);
					
					fallar++;
				}
					
			}
			
			if (fallar>=2) {
				
				System.out.println("Has suspendido porque has tenido " + fallar + " fallos.");
			}

			System.out.println("¿Deseas aprender otra tabla? (s/n)");
			
			String respuesta = teclado.next();
			
			if (respuesta.equals("n")) {
				
				continuar = false; 
				
				System.out.println();
				
				teclado.close();
		}
		
		}
		}

		}
	}
