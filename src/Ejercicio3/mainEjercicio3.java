package Ejercicio3;

import java.util.ArrayList;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		Polideportivo p= new Polideportivo();
		p.setNombrePolideportivo("El gran escobar");
		System.out.println(p.toString());
		
		Oficina o = new Oficina(1, 500, 1);
		System.out.println(o.toString());
		
		ArrayList<IEdificio> Listaedificios = new ArrayList<>(5);
		
		Listaedificios.add(new Polideportivo(3000, 1, "Polideportivo 1"));
		Listaedificios.add(new Polideportivo(1500, 2, "Polideportivo 2"));
		Listaedificios.add(new Polideportivo(4000, 3, "Polideportivo 3"));
		Listaedificios.add(new Oficina(30, 800, 1));
		Listaedificios.add(new Oficina(20, 400, 2));
	}
}
