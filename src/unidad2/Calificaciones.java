package unidad2;

import java.io.*;
import java.text.*;

public class Calificaciones {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Introduce la nota de tu examen de matemáticas");
		String examenMat = br.readLine();
		double notaExamenMat = Double.parseDouble(examenMat);
		System.out.println("Introduce la nota de la tarea 1 de matemáticas");
		String tareaMat1 = br.readLine();
		double notaTareaMat1 = Double.parseDouble(tareaMat1);
		System.out.println("Introduce la nota de la tarea 2 de matemáticas");
		String tareaMat2 = br.readLine();
		double notaTareaMat2 = Double.parseDouble(tareaMat2);
		System.out.println("Introduce la nota de la tarea 3 de matemáticas");
		String tareaMat3 = br.readLine();
		double notaTareaMat3 = Double.parseDouble(tareaMat3);
		double notaMat = (notaExamenMat*0.9)+(((notaTareaMat1+notaTareaMat2+notaTareaMat3)*0.1)/3);
		System.out.println("Tu nota en la asignatura de MATEMÁTICAS es un " +df.format(notaMat));
		
		
		System.out.println("Introduce la nota de tu examen de física");
		String examenFis = br.readLine();
		double notaExamenFis = Double.parseDouble(examenFis);
		System.out.println("Introduce la nota de la tarea 1 de física");
		String tareaFis1 = br.readLine();
		double notaTareaFis1 = Double.parseDouble(tareaFis1);
		System.out.println("Introduce la nota de la tarea 2 de física");
		String tareaFis2 = br.readLine();
		double notaTareaFis2 = Double.parseDouble(tareaFis2);
		double notaFis = (notaExamenFis*0.8)+(((notaTareaFis1+notaTareaFis2)*0.2)/2);
		System.out.println("Tu nota en la asignatura de FÍSICA es un " +df.format(notaFis));		

		
		System.out.println("Introduce la nota de tu examen de química");
		String examenQui = br.readLine();
		double notaExamenQui = Double.parseDouble(examenQui);
		System.out.println("Introduce la nota de la tarea 1 de química");
		String tareaQui1 = br.readLine();
		double notaTareaQui1 = Double.parseDouble(tareaQui1);
		System.out.println("Introduce la nota de la tarea 2 de química");
		String tareaQui2 = br.readLine();
		double notaTareaQui2 = Double.parseDouble(tareaQui2);
		System.out.println("Introduce la nota de la tarea 3 de química");
		String tareaQui3 = br.readLine();
		double notaTareaQui3 = Double.parseDouble(tareaQui3);
		double notaQui = (notaExamenQui*0.85)+(((notaTareaQui1+notaTareaQui2+notaTareaQui3)*0.15)/3);
		System.out.println("Tu nota en la asignatura de QUÍMICA es un " +df.format(notaQui));	
		
		double notaCurso = (notaMat+notaFis+notaQui)/3;
		System.out.println("La nota media de tu curso es " + df.format(notaCurso));
		
	
	}

}
