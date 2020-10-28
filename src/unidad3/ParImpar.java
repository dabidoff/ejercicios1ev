package unidad3;

import java.util.*;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número para comprobar si es par o impar:");
		
		float valor = sc.nextFloat();
		
		if(valor %2 ==0){
			
			System.out.println("El numero introducido es par");
		} else {
			
			System.out.println("El numero introducido es impar");
		}

	}

}
