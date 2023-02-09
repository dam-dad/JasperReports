package dad.informes.juegos;

import java.util.ArrayList;
import java.util.List;

public class HighscoreDataSource {

	public static List<Puntuacion> getHighscore() {
		List<Puntuacion> highscore = new ArrayList<>();
		highscore.add(new Puntuacion("Chuck Norris", 1289));
		highscore.add(new Puntuacion("Charles Bronson", 56));
		highscore.add(new Puntuacion("Clint Eastwood", 7));
		highscore.add(new Puntuacion("Sylvester Stallone", 1));
		return highscore;
	}

}
