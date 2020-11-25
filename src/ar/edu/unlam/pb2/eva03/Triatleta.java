package ar.edu.unlam.pb2.eva03;

public class Triatleta extends Deportista {

	private String distanciaPreferida;
	private String tipoDeBicicleta;

	public Triatleta(Integer n1, String nombre, String distancia, String bicicleta) {
		super(n1, nombre);
		this.distanciaPreferida = distancia;
		this.tipoDeBicicleta = bicicleta;
		this.setEspecialidad("Triatleta");
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBicleta) {
		this.tipoDeBicicleta = tipoDeBicleta;
	}
	
}