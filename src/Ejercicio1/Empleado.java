package Ejercicio1;

public class Empleado {
	//Atributos
	private final int id;
	private String nombre;
	private int edad;
	private static int cont=999;
	
	//Constructores
	public Empleado(){
		cont++;
		this.id = cont;
		this.nombre="sin nombre";
		this.edad=99;
	}
	public Empleado(String nombre,int edad){
		cont++;
		this.id = cont;
		this.nombre=nombre;
		this.edad=edad;
	}
	
	//Gets y sets
	public int getId() {
		return id;
	}
	/*public void setId(int id) {
		this.id = id;
	}*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//M�todos
	public static int devuelveProximoID()
	{
		return cont+1;
	}
	
	@Override
	public String toString() {
		return "Empleado ID: " + id + ", NOMBRE: " + nombre + ", EDAD: " + edad;
	}
}