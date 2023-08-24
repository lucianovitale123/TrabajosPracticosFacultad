package Ejercicio3;

public class mainEjercicio3 {

	public static void main(String[] args) {
		
		Polideportivo p= new Polideportivo();
		p.setNombrePolideportivo("El gran escobar");
		System.out.println(p.toString());
		
		Oficina o = new Oficina(1, 500, 1);
		System.out.println(o.toString());
		
	}
}
