package Ejercicio2;

public class ProductoFresco extends Producto {
	//Atributos
	private String FechaDeEnvasado;
	private String PaisDeOrigen;
	
	//Constructores
	public ProductoFresco() {
		this.PaisDeOrigen="Argentina";
		this.FechaDeEnvasado="01/01/2001";
	}
	public ProductoFresco(String Fecha, String pais) {
		this.PaisDeOrigen=pais;
		this.FechaDeEnvasado=Fecha;
	}
	
	//Gets y sets
	public String getFechaDeEnvasado() {
		return FechaDeEnvasado;
	}
	public void setFechaDeEnvasado(String fechaDeEnvasado) {
		FechaDeEnvasado = fechaDeEnvasado;
	}
	public String getPaisDeOrigen() {
		return PaisDeOrigen;
	}
	public void setPaisDeOrigen(String paisDeOrigen) {
		PaisDeOrigen = paisDeOrigen;
	}
	
	//Métodos
}
