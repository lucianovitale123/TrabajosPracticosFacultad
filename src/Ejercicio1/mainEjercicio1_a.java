package Ejercicio1;
import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio1_a {

	public static void main(String[] args) {
		
		Profesor p1 = new Profesor("Jorge", 37, "Profesor Adjunto", 4);
		Profesor p2 = new Profesor("Tamara", 32, "Profesora Adjunta", 5);
		Profesor p3 = new Profesor("Tomas", 41, "JTP", 2);
		Profesor p4 = new Profesor("Laura", 27, "Ayudante de primera", 3);
		Profesor p5 = new Profesor("Claudio", 45, "Profesor Adjunto", 8);
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>(5);
		
		listaProfesores.add(p1);
		listaProfesores.add(p2);
		listaProfesores.add(p3);
		listaProfesores.add(p4);
		listaProfesores.add(p5);
		
		System.out.println("Listado de profesores: ");
		
		ListIterator <Profesor> ilp = listaProfesores.listIterator();
		
		while(ilp.hasNext()) {
			Profesor profesor = ilp.next();
			ilp.remove();
			System.out.println(profesor.toString());
		}
	}
}
