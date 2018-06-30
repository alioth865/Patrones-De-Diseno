/**
 * aliot
 * 01-jul-2018
 */
package laberinto;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Laberinto.
 */
public class Laberinto {

	/** The laberinto. */
	private final Map<Integer, Habitacion> laberinto = new HashMap<Integer, Habitacion>();

	/**
	 * Añadir habitacion.
	 *
	 * @param hab
	 *            the hab
	 */
	public void anadirHabitacion(Habitacion hab) {
		this.laberinto.put(hab.getNumeroDeHabitacion(), hab);
	}

	/**
	 * Numero de habitacion.
	 *
	 * @param numeroDeHabitacion
	 *            the numero de habitacion
	 * @return the habitacion
	 */
	public Habitacion numeroDeHabitacion(int numeroDeHabitacion) {
		return this.laberinto.get(numeroDeHabitacion);
	}

}
