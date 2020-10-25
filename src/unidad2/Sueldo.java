package unidad2;

import java.util.*;
import java.text.*;


public class Sueldo {

	public static void main(String[] args) {
		
		final int sueldoBase = 1150;
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el importe de la venta 1");
		
		double venta1 = sc.nextDouble();
		
		System.out.println("Introduce el importe de la venta 2");
		
		double venta2 = sc.nextDouble();
		
		System.out.println("Introduce el importe de la venta 1");
		
		double venta3 = sc.nextDouble();
		
		double comision = (venta1+venta2+venta3)*0.1;
		
		double sueldoMes = sueldoBase+comision;
				
		System.out.println("El importe de la comisión por ventas de este mes es de " + df.format(comision) + "€." + "Y tu sueldo total a cobrar a es de " + df.format(sueldoMes) + "€.");
		
		sc.close();
	}

}
