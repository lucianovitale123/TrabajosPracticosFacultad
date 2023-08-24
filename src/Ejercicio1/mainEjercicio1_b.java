package Ejercicio1;

import java.util.Iterator;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {
		Profesor p1 = new Profesor("Jorge", 37, "Profesor Adjunto", 4);
		Profesor p2 = new Profesor("Tamara", 32, "Profesora Adjunta", 5);
		Profesor p3 = new Profesor("Tomas", 41, "JTP", 2);
		Profesor p4 = new Profesor("Laura", 27, "Ayudante de primera", 3);
		Profesor p5 = new Profesor("Claudio", 45, "Profesor Adjunto", 8);

		TreeSet<Profesor>listaProfes = new TreeSet<Profesor>();
		listaProfes.add(p1);
		listaProfes.add(p2);
		listaProfes.add(p3);
		listaProfes.add(p4);
		listaProfes.add(p5);
		listaProfes.add(p1);
		
		System.out.println("Listado de profesores: ");
		
		Iterator<Profesor>it=listaProfes.iterator();
		while(it.hasNext()) {
			Profesor profe = (Profesor) it.next();
			System.out.println(profe.toString());
		}
	}
}
