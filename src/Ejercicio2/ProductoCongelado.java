package Ejercicio2;

public class ProductoCongelado extends Producto{
	//Atributos
	private int tempCongelacion;

	
	//Constructores
	
	public ProductoCongelado() {
		super();
		this.tempCongelacion= -4;
	}
	
	public ProductoCongelado (String FechaCaducidad, int lote, int tempCongelacion) {
		super(FechaCaducidad, lote);
		this.tempCongelacion = tempCongelacion;
	}
	
	//Gets y sets
	
	public int getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(int tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}


	//M�todos
	
	@Override
	
	public String toString() {
		return super.toString() + ", T° de Congelacion: " + tempCongelacion;
	}
	
	
}
