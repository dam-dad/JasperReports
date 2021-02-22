package dad.informes.factura;

public class Producto {
	private String descripcion;
	private Integer unidades;
	private Double precio;
	private String rutaImagen = "images/logo.jpg";

	public Producto() {
	}

	public Producto(String descripcion, Integer unidades, Double precio) {
		super();
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

}
