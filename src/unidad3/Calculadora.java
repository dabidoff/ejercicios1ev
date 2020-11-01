package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("Introduce la operación que deseas realizar (suma/resta/multiplicación/división)");
			
			String operacion = teclado.next();
			
			if (operacion.equals("suma") || operacion.equals("resta") || operacion.equals("multiplicación") || operacion.equals("división")) {
				
			
			System.out.println("Introduce el número 1");
			
			int num1 = teclado.nextInt();
			
			System.out.println("Introduce el número 2");
			
			int num2 = teclado.nextInt();
			
			int resultado;
			
			if(operacion.equals("suma")) {
				
				resultado = num1+num2;
				
				System.out.println(num1 + " + " + num2 + " = " + resultado);
				
			}
			
			if(operacion.equals("resta")) {
				
				resultado = num1-num2;
				
				System.out.println(num1 + " - " + num2 + " = " + resultado);
				
			}
			
			if(operacion.equals("multiplicación")) {
				
				resultado = num1*num2;
				
				System.out.println(num1 + " x " + num2 + " = " + resultado);
				
			}
			
			if(operacion.equals("división")) {
				
				resultado = num1/num2;
				
				System.out.println(num1 + " / " + num2 + " = " + resultado);
				
			}

			
			System.out.println("¿Deseas realizar una nueva operación? (s/n)");
			
			String respuesta = teclado.next();
			
			if (respuesta.equals("n")) {
				
				continuar = false;
			}
			
			}else {
				
				System.out.println("¡ERROR!: No has introducido un nombre de operación correcto: (suma/resta/multiplicación/división)");
			}
		}
		teclado.close();

	}

}
