package dad.informes.agenda;

import java.util.ArrayList;
import java.util.List;

public class AgendaDataProvider {

	public static List<Persona> getPersonas() {
		List<Persona> personas = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			Persona p = new Persona();
			p.setNombre("Nombre-" + i);
			p.setApellidos("Apellidos-" + i);
			p.setTelefono((long)i);
			personas.add(p);
		}
		return personas;
	}
	
	public static List<Persona> getProfesores() {
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Francisco", "Vargas Ruiz", 922102030L));
		personas.add(new Persona("Angel", "Pérez Cabeza", 922223344L));
		personas.add(new Persona("Fco. Javier", "López Marrero", 656771122L));
		personas.add(new Persona("Fulgencio", "Sánchez Vera", 922304055L));
		personas.add(new Persona("Fernando", "Toboso Lara", 666555444L));
		return personas;
	}

}
