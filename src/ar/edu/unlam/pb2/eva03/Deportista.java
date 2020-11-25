package ar.edu.unlam.pb2.eva03;

public class Deportista {

	private Integer numeroDeSocio;
	private String nombre;
	private String especialidad;
	
	public Deportista(Integer n1, String nombre) {
		this.numeroDeSocio = n1;
		this.nombre = nombre;
		this.especialidad = "Ninguna";
	}

	public Integer getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numero) {
		this.numeroDeSocio = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
}
