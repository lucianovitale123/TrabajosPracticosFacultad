package Ejercicio2;

public class Producto {
	//Atributos
	private int NroLote;
	private String FechaDeCaducidad;
	
	//Constructores
	public Producto() {
		this.NroLote=999;
		this.FechaDeCaducidad="01/01/2001";
	}
	public Producto(String Fecha, int lote) {
		this.NroLote=lote;
		this.FechaDeCaducidad=Fecha;
	}
	
	//Gets y sets
	public int getNroLote() {
		return NroLote;
	}
	public void setNroLote(int nroLote) {
		NroLote = nroLote;
	}
	public String getFechaDeCaducidad() {
		return FechaDeCaducidad;
	}
	public void setFechaDeCaducidad(String fechaDeCaducidad) {
		FechaDeCaducidad = fechaDeCaducidad;
	}
	
	//Métodos
}
