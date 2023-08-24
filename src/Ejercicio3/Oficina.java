package Ejercicio3;

public class Oficina implements IEdificio, IinstalacionDeportiva{
	//Atributos
	private int nroOficinas;
	private double superficieEdificio;
	private int tipoDeInstalacion;

	//Constructores
	public Oficina() {
		nroOficinas = -1;
		superficieEdificio = -1;
		tipoDeInstalacion = -1;
	}
	
	public Oficina(int nroOficinas, double superficieEdificio, int tipoDeInstalacion) {
		this.nroOficinas = nroOficinas;
		this.superficieEdificio = superficieEdificio;
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	//Sets y Gets
	public int getNroOficinas() {
		return nroOficinas;
	}

	public void setNroOficinas(int nroOficinas) {
		this.nroOficinas = nroOficinas;
	}

	public void setSuperficieEdificio(double superficieEdificio) {
		this.superficieEdificio = superficieEdificio;
	}

	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}
	
	//Metodos de interfaz (gets)
	@Override
	public int getTipoDeInstalacion() {
		return this.tipoDeInstalacion;
	}

	@Override
	public double getSuperficieEdificio() {
		return this.superficieEdificio;
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Oficina: nroOficinas=" + nroOficinas + ", superficieEdificio=" + superficieEdificio
				+ ", tipoDeInstalacion=" + tipoDeInstalacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nroOficinas;
		long temp;
		temp = Double.doubleToLongBits(superficieEdificio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + tipoDeInstalacion;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oficina other = (Oficina) obj;
		if (nroOficinas != other.nroOficinas)
			return false;
		if (Double.doubleToLongBits(superficieEdificio) != Double.doubleToLongBits(other.superficieEdificio))
			return false;
		if (tipoDeInstalacion != other.tipoDeInstalacion)
			return false;
		return true;
	}
}
