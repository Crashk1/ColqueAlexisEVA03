package ar.edu.unlam.pb2.eva03;

public class Ciclista extends Deportista {
	
	private String tipoDeBicicleta;
	
	public Ciclista(Integer n1, String nombre, String bicicleta) {
		super(n1, nombre);
		this.tipoDeBicicleta = bicicleta;
		this.setEspecialidad("Ciclista");
	}

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	
}
