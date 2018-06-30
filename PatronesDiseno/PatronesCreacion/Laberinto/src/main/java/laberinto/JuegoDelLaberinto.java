/**
 * aliot
 * 01-jul-2018
 */
package laberinto;

public class JuegoDelLaberinto {
	
	/**
	 * Crear laberinto.
	 */
	public Laberinto crearLaberinto() {
		final Laberinto laberinto = new Laberinto();
		final Habitacion h1 = new Habitacion(1);
		final Habitacion h2 = new Habitacion(2);
		final Puerta puerta = new Puerta(h1, h2);

		laberinto.anadirHabitacion(h1);
		laberinto.anadirHabitacion(h2);

		h1.establecerLado(Direccion.NORTE, new Pared());
		h1.establecerLado(Direccion.ESTE, puerta);
		h1.establecerLado(Direccion.SUR, new Pared());
		h1.establecerLado(Direccion.OESTE, new Pared());

		h2.establecerLado(Direccion.NORTE, new Pared());
		h2.establecerLado(Direccion.ESTE, new Pared());
		h2.establecerLado(Direccion.SUR, new Pared());
		h2.establecerLado(Direccion.OESTE, puerta);

		return laberinto;
	}
}
