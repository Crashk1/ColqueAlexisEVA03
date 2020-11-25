package ar.edu.unlam.pb2.eva03;

public class Nadador extends Deportista {

	private String estiloPreferido;
	
	public Nadador(Integer n1, String nombre, String estilo) {
		super(n1, nombre);
		this.estiloPreferido = estilo;
		this.setEspecialidad("Nadador");
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}
	
}
