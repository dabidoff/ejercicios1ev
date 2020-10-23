package unidad2;

import java.io.*;
import java.text.*;

public class Conversor {

	public static void main(String[] args) throws IOException {
		
		final double dolar = 1.19;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Introduce el valor en euros que quieras convertir");
		
		String euro = br.readLine();
		
		double valorEuro = Double.parseDouble(euro);
		
		double valorCambio = valorEuro*dolar;
			
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Tus " +euro+ "€ son " +df.format(valorCambio)+ "$.");
		

	}

}
