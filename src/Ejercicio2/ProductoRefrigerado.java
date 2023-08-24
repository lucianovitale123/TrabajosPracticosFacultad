package Ejercicio2;

public class ProductoRefrigerado extends Producto{
	//Atributos
	private String codOrganismo;

	


	//Constructores
	
	public ProductoRefrigerado() {
		super();
		this.codOrganismo = "EMP123";
	}
	
	public ProductoRefrigerado(String fechaCaducidad, int lote, String codOrganismo) {
		super(fechaCaducidad, lote);
		this.codOrganismo = codOrganismo;
	}
	
	//Gets y sets
	public String getCodOrganismo() {
		return codOrganismo;
	}
	
	public void setCodOrganismo(String codOrganismo) {
		this.codOrganismo = codOrganismo;
	}

	
	//M�todos
	
	@Override
	public String toString() {
		return super.toString()  + ", Codigo de Organismo: " + codOrganismo;
	}
	
}
