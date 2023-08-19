package Ejercicio1;

public class Profesor extends Empleado{
	private String cargo;
	private int antiguedadDocente;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + antiguedadDocente;
	result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
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
	Profesor other = (Profesor) obj;
	if (antiguedadDocente != other.antiguedadDocente)
		return false;
	if (cargo == null) {
		if (other.cargo != null)
			return false;
	} else if (!cargo.equals(other.cargo))
		return false;
	return true;
}
@Override
public String toString() {
	return "Profesor [cargo=" + cargo + ", antiguedadDocente=" + antiguedadDocente + ", getCargo()=" + getCargo()
			+ ", getAntiguedadDocente()=" + getAntiguedadDocente() + ", getId()=" + getId() + ", getNombre()="
			+ getNombre() + ", getEdad()=" + getEdad() + ", toString()=" + super.toString() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + "]";
}
public String getCargo() {
	return cargo;
}
public void setCargo(String cargo) {
	this.cargo = cargo;
}
public int getAntiguedadDocente() {
	return antiguedadDocente;
}
public void setAntiguedadDocente(int antiguedadDocente) {
	this.antiguedadDocente = antiguedadDocente;
}
}
