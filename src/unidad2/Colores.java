package unidad2;

import java.io.*;

public class Colores {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println ("Introduce el valor de rojo");
		
		String red = bf.readLine();
		
		double r = Double.parseDouble(red);

		System.out.println ("Introduce el valor de verde");
		
		String green = bf.readLine();
		
		double g = Double.parseDouble(green);
		
		System.out.println ("Introduce el valor de azul");
		
		String blue = bf.readLine();
		
		double b = Double.parseDouble(blue);
		
		
		double y = (0.299*r+0.587*g+0.114*b);
		double i = (0.596*r-0.275*g-0.321*b);
		double q = (0.212*r-0.528*g+0.311*b);
		
		System.out.println ("Tu combinación de RGB en YIQ es la siguiente:");
		System.out.println ("Y: " + y);
		System.out.println ("I: " + i);
		System.out.println ("Q: " + q);

	}

}
