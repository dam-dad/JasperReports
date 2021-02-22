package dad.informes.juegos;

public class Juego {

	private String nombre;
	private String descripcion;
	private Genero genero;
	private Integer lanzamiento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getLanzamiento() {
		return lanzamiento;
	}

	public void setLanzamiento(Integer lanzamiento) {
		this.lanzamiento = lanzamiento;
	}

}
