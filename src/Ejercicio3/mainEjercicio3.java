package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;

public class mainEjercicio3 {

	public static void main(String[] args) {

		ArrayList<IEdificio> listaEdificios = new ArrayList<>(5);
		
		listaEdificios.add(new Polideportivo(3000, 1, "Polideportivo 1"));
		listaEdificios.add(new Polideportivo(1500, 2, "Polideportivo 2"));
		listaEdificios.add(new Polideportivo(4000, 3, "Polideportivo 3"));
		listaEdificios.add(new Oficina(30, 800));
		listaEdificios.add(new Oficina(20, 400));
		
		System.out.println("Lista de edificios");
		
		ListIterator<IEdificio> it = listaEdificios.listIterator();
		while(it.hasNext()) {
			IEdificio edificio = it.next();
			it.remove();
			System.out.println(edificio.toString());
		}
		
	}
}
