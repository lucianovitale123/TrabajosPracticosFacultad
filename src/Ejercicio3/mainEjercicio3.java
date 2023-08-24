package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		Polideportivo p= new Polideportivo();
		p.setNombrePolideportivo("El gran escobar");
		System.out.println(p.toString());
		
		Oficina o = new Oficina(1, 500, 1);
		System.out.println(o.toString());
		
		ArrayList<IEdificio> listaEdificios = new ArrayList<>(5);
		
		listaEdificios.add(new Polideportivo(3000, 1, "Polideportivo 1"));
		listaEdificios.add(new Polideportivo(1500, 2, "Polideportivo 2"));
		listaEdificios.add(new Polideportivo(4000, 3, "Polideportivo 3"));
		listaEdificios.add(new Oficina(30, 800, 1));
		listaEdificios.add(new Oficina(20, 400, 2));
		
		System.out.println("Lista de edificios");
		
		ListIterator<IEdificio> it = listaEdificios.listIterator();
		while(it.hasNext()) {
			IEdificio edificio = it.next();
			it.remove();
			System.out.println(edificio.toString());
		}
		
	}
}
