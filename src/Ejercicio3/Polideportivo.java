package Ejercicio3;

public class Polideportivo implements IinstalacionDeportiva, IEdificio {
	
	//Propiedades
	private double superficieEdificio;
	private int tipoDeInstalacion;
	private String nombrePolideportivo;
	
	//Constructors
	public Polideportivo() {
		super();
		this.superficieEdificio = -1;
		this.tipoDeInstalacion = -1 ;
		this.nombrePolideportivo = "Default";
	}
	
	public Polideportivo(double superficieEdi, int tipoInstalacion, String nombrePoli) {
		super();
		this.superficieEdificio =  superficieEdi;
		this.tipoDeInstalacion =  tipoInstalacion;
		this.nombrePolideportivo = nombrePoli;
	}
	
	//Sets y gets
	
	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	public void setNombrePolideportivo(String nombrePolideportivo) {
		this.nombrePolideportivo = nombrePolideportivo;
	}

	public String getNombrePolideportivo() {
		return nombrePolideportivo;
	}	
	// Metodos
	
	@Override
	public double getSuperficieEdificio() {
		
		return this.superficieEdificio;
	}
	
	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombrePolideportivo + ", Superficie del edificio: " + superficieEdificio + ", Tipo de instalacion: " + tipoDeInstalacion;
	}
}