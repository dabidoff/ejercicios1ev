package unidad2;

import java.io.*;
import java.text.*;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Introduce tu nombre: ");
		
		long inicio = System.currentTimeMillis();
		
		String nombre = br.readLine();
		
		long fin = System.currentTimeMillis();
		
		double tiempo = (fin-inicio);
		
		DecimalFormat df = new DecimalFormat("#.000");
		
		System.out.println("Has tardado " +df.format(tiempo/1000)+ " segundos en introducirlo.");

	}

}
