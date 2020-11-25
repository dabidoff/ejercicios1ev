package unidad4;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int longitud = (int)Math.floor(Math.random()*491+10);
		
		int [] vector = new int [longitud];
		
		rellenarArray(vector, longitud);
		mostrarArray(vector, longitud);
			

	}//main
	
	public static void rellenarArray (int[] vector, int longitud) {
		
	int valor;
	
		for(int i=0; i<longitud; i++) {
			
			valor = (int)Math.floor(Math.random()*201-100);
			
			vector[i]=valor;
			
		}
		
	}//rellenar
	
	public static void mostrarArray (int[] vector, int longitud) {
		
		if(longitud<50) {
			
			for(int i=0; i<longitud; i++) {
				
				System.out.print(vector[i] + " ");
				
			}
		}else {
			
			System.out.println("El tamaño del vector es superior a 50");
		}
		
		System.out.println("Hay " +mostrarSecuenciaRepetido(vector)+ " secuencias en el vector");
		
	}//mostrar
	
	
	public static int mostrarSecuenciaRepetido (int [] vector) {
		
		int i=0, numero, contador=0, secuencia =0;
		
		do {
			
			numero=vector[i];
			contador=1;
			i++;
			
				while(i<vector.length && numero == vector[i]) {
					
					contador++;
					i++;
			
				}
				
				if(contador>1)
					secuencia++;
			
		}while(i<vector.length);
		
		return secuencia;
		

		
	}//secuencia


}
