package dad.informes.inventario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InventarioDataProvider {
	
	public static List<Producto> getAllProducts() {
		
		Random rnd = new Random();
		
		List<Producto> productos = new ArrayList<>();
		
		for (long i = 1; i <= 500; i++) {
			
			Producto producto = new Producto();
			producto.setId(i);
			producto.setNombre("Producto nº " + i);
			producto.setDescripcion("Descripción " + i);
			producto.setCantidad(rnd.nextInt());
			productos.add(producto);
			
		}
		
		return productos;
	}
	
}
