package unidad4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño del verctor (10-1.000.000)");
		
		int longitud = sc.nextInt();
		
		sc.close();
		
		long startTime=0, endTime=0;
		
		while(longitud<10 | longitud>1000000) {
			
			System.out.println("Introduce un tamaño válido");
			
			longitud = sc.nextInt();
			
		}
		
		int[] vector = new int [longitud];
		
		System.out.println("El tamaño del vector es "+longitud);
	
		rellenarArray(vector, longitud, startTime, endTime);
		
		calcularDiferencia(vector, startTime, endTime);

		
	}//main
	
	public static void rellenarArray(int[] vector, int longitud, long startTime, long endTime) {
		
		int valor, numeros_vector = 0;
		
		startTime = System.currentTimeMillis();
		
		while (numeros_vector<longitud) {
		
			valor = (int)Math.floor(Math.random()*2000000-999999);
			
			if(encontrarEnArray(vector, numeros_vector, valor) == false) {
				
				vector[numeros_vector]=valor;
				
				System.out.print(vector[numeros_vector]+" ");
				
				numeros_vector++;
			
				
			}//if
			
		}//while
		
		endTime = System.currentTimeMillis() - startTime;
		
		System.out.println("");
		
		System.out.println("El tiempo empleado en rellenar el vector ha sido " +(endTime*0.001)+ " segundos");
		
		
	}//rellenar
	
	public static boolean encontrarEnArray(int [] vector, int numeros_vector, int valor) {
		
		boolean encontrado=false;
		
		for(int i=0; i<numeros_vector; i++) {
			
			if(vector[i]==valor) {
				encontrado=true;
			}
			
		}
		
		
		return encontrado;
		
		
	}//encontrar
	
	
	
	public static void calcularDiferencia(int[] vector, long startTime, long endTime) {
		
		int elMayor=0, elMenor=0;
		
		startTime = System.currentTimeMillis();
		
		for(int z=0; z<vector.length; z++) {
			
			if(vector[z]>elMayor)
				elMayor=vector[z];
			
			if(vector[z]<elMenor) 
				elMenor=vector[z];
				
		}
		
		endTime = System.currentTimeMillis() - startTime;
		
		System.out.println(elMayor);
		
		System.out.println(elMenor);

		System.out.println("La diferencia entre el mayor y el menor número del array es " +(elMayor-elMenor));
		
		System.out.println("El tiempo empleado en calcular la diferencia es "+ (endTime*0.001)+ " segundos");
		
	}//diferencia
	
}
