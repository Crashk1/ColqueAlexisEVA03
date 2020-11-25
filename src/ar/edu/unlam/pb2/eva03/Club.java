package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club{

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;
	
	public Club(String nombre) {
		this.nombre = nombre;
		
	}
	
	public void crearEvento(TipoDeEvento tipo, String string) {
	
		this.competencias.put(string, new Evento(tipo));
	}

	public void agregarDeportista(Deportista deportista) {
		socios.add(deportista);
	}
	
	public Integer getCantidadSocios() {
		return socios.size();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public Boolean inscribirEnEvento(String string, Deportista deportista) throws NoEstaPreparado {
		switch (competencias.get(string).getTipo()) {
		
		case CARRERA_5K: 
			if (deportista.getEspecialidad() != "Corredor")
				throw new NoEstaPreparado();
			else {
				competencias.get(string).agregarParticipante(deportista);
			return true;
			}
		case CARRERA_10K: 
			if (deportista.getEspecialidad() != "Corredor")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		case CARRERA_21K: 
			if (deportista.getEspecialidad() != "Corredor")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
				
		case CARRERA_42K: 
			if (deportista.getEspecialidad() != "Corredor")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
				
		case DUATLON: 
			if (deportista.getEspecialidad() != "Corredor" || deportista.getEspecialidad() != "Ciclista")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
				
		case CARRERA_NATACION_EN_PICINA: 
			if (deportista.getEspecialidad() != "Nadador")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
		
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (deportista.getEspecialidad() != "Nadador")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		case TRIATLON_SHORT:
			if (deportista.getEspecialidad() != "Corredor" || deportista.getEspecialidad() != "Ciclista")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		case TRIATLON_OLIMPICO:
			if (deportista.getEspecialidad() != "Corredor" || deportista.getEspecialidad() != "Ciclista")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		case TRIATLON_MEDIO:
			if (deportista.getEspecialidad() != "Corredor" || deportista.getEspecialidad() != "Ciclista")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		case TRIATLON_IRONMAN:
			if (deportista.getEspecialidad() != "Corredor" || deportista.getEspecialidad() != "Ciclista")
				throw new NoEstaPreparado();
			else{
				competencias.get(string).agregarParticipante(deportista);
				return true;
			}
			
		default:
			return null;
		}
	}
	
}
