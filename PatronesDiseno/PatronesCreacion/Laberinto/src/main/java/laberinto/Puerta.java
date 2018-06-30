/**
 * aliot
 * 01-jul-2018
 */
package laberinto;

/**
 * The Class Puerta.
 */
public class Puerta extends LugarDelMapa {

	/** The h 1. */
	private final Habitacion h1;

	/** The h 2. */
	private final Habitacion h2;

	/** The is abierta. */
	private boolean isAbierta;

	/**
	 * Instantiates a new puerta.
	 *
	 * @param h1
	 *            the habitacion 1
	 * @param h2
	 *            the habitacion 2
	 */
	public Puerta(final Habitacion h1, final Habitacion h2) {
		this.h1 = h1;
		this.h2 = h2;
	}

	/** {@inheritDoc} */
	@Override
	public void entrar() {
		System.out.println("Esta entrando en la puerta entre: " + this.h1 + " y " + this.h2);
	}

	/**
	 * Otro lado de.
	 *
	 * @param h
	 *            the h
	 * @return the habitacion
	 */
	public Habitacion otroLadoDe(Habitacion h) {
		if (h.equals(this.h1)) {
			return this.h2;
		}
		if (h.equals(this.h2)) {
			return this.h1;
		}
		// No es una habitacion válida
		return null;
	}

	/**
	 * Checks if is abierta.
	 *
	 * @return true, if is abierta
	 */
	public boolean isAbierta() {
		return this.isAbierta;
	}

}
