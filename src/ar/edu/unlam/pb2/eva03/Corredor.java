package ar.edu.unlam.pb2.eva03;

public class Corredor extends Deportista {

	private Integer distanciaPreferida;
	private Integer cantidadDeKilometrosEntrenados;

	public Corredor(Integer n1, String nombre, Integer distancia) {
		super(n1, nombre);
		this.distanciaPreferida = distancia;
		this.setEspecialidad("Corredor");
	}

	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		this.cantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}
	
}