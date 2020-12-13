package unidad4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int longitud=0;
		
		while(longitud<10 || longitud>20) {
			
			System.out.println("Introduce un tamaño de vector entre 10 y 20");
			
			longitud = sc.nextInt();
		}
		
		int[] vector = new int [longitud];
		
		rellenarVector(vector);
		
		mostrarVector(vector);
		
		diferenciaVector(vector);
		

	}//main
	
	public static void rellenarVector (int [] lista) {
		
		for(int i=0; i<lista.length; i++) {
			
			lista[i]=(int)Math.round(Math.random()*101);
			
		}
		
		for(int i=0; i<lista.length; i++) {
			
			System.out.print(lista[i] + " ");
			
		}
		
		
		
	}//rellenar
	
	public static void mostrarVector (int [] lista) {
		
		for(int i=0; i<lista.length; i++) {
			
			System.out.print(lista[i] + " ");
			
		}
		
		System.out.println( " ");
		
	}//mostrar
	
	public static void diferenciaVector (int [] lista) {
		
		int[] vector2 = new int [lista.length];
		
		int j=0, minimo=0;
		
		for (int i=1; i<lista.length; i++) {
			
			vector2[j]=Math.abs(lista[i]-lista[i-1]);
			
			j++;
			
		}
		
		for (int i=0; i<j; i++) {
			
			System.out.print(vector2[i] + " ");
		}
		
		minimo=vector2[0];
		
		for (int i=0; i<j; i++) {
			
			if(vector2[i]<minimo) {
				
				minimo=vector2[i];
			}
		}
		
		System.out.println( " ");
		
		System.out.print("La mínima diferencia es " + minimo);
		
		
	}
	

}
