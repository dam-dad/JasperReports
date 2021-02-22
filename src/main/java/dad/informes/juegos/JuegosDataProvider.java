package dad.informes.juegos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JuegosDataProvider {
	
	public static List<Juego> getMisJuegos() {
		
		Random rnd = new Random();
		
		List<Juego> juegos = new ArrayList<>();
		
		for (long i = 1; i <= 500; i++) {
			
			Juego juego = new Juego();
			juego.setNombre("Juegazo nº " + i);
			juego.setDescripcion("Descripción " + i);
			juego.setLanzamiento(1980 + rnd.nextInt(30));
			juego.setGenero(Genero.values()[rnd.nextInt(Genero.values().length)]);
			juegos.add(juego);
			
		}
		
		return juegos;
	}
	
}
