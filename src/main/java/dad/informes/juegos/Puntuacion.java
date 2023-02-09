package dad.informes.juegos;

import java.time.LocalDateTime;

public class Puntuacion {

	private String nombre;
	private Integer puntos;
	private LocalDateTime fecha;

	public Puntuacion(String nombre, Integer puntos) {
		super();
		this.nombre = nombre;
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPuntos() {
		return puntos;
	}

	public void setPuntos(Integer puntos) {
		this.puntos = puntos;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

}
