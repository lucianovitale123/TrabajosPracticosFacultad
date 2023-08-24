package Ejercicio2;

public class ProductoFresco extends Producto {
	//Atributos
	private String FechaDeEnvasado;
	private String PaisDeOrigen;
	
	//Constructores
	
	public ProductoFresco() {
		super();
		this.PaisDeOrigen= "Argentina";
		this.FechaDeEnvasado= "01/01/2023";
	}
	public ProductoFresco(String fechaCaducidad, int lote, String pais, String fechaEnvasado) {
		super(fechaCaducidad, lote);
		this.PaisDeOrigen= pais;
		this.FechaDeEnvasado= fechaEnvasado;
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
	
	@Override
	public String toString() {
		return super.toString() + ", FechaDeEnvasado: " + FechaDeEnvasado + ", PaisDeOrigen: " + PaisDeOrigen;
	}
	
	//M�todos
	
	
}
