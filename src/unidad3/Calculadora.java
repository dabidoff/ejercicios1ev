package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		boolean continuar = true;
		
		while(continuar) {
			
			System.out.println("Introduce la operaci�n que deseas realizar (suma/resta/multiplicaci�n/divisi�n)");
			
			String operacion = teclado.next();
			
			if (operacion.equals("suma") || operacion.equals("resta") || operacion.equals("multiplicaci�n") || operacion.equals("divisi�n")) {
				
			
			System.out.println("Introduce el n�mero 1");
			
			int num1 = teclado.nextInt();
			
			System.out.println("Introduce el n�mero 2");
			
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
			
			if(operacion.equals("multiplicaci�n")) {
				
				resultado = num1*num2;
				
				System.out.println(num1 + " x " + num2 + " = " + resultado);
				
			}
			
			if(operacion.equals("divisi�n")) {
				
				resultado = num1/num2;
				
				System.out.println(num1 + " / " + num2 + " = " + resultado);
				
			}

			
			System.out.println("�Deseas realizar una nueva operaci�n? (s/n)");
			
			String respuesta = teclado.next();
			
			if (respuesta.equals("n")) {
				
				continuar = false;
			}
			
			}else {
				
				System.out.println("�ERROR!: No has introducido un nombre de operaci�n correcto: (suma/resta/multiplicaci�n/divisi�n)");
			}
		}
		teclado.close();

	}

}
