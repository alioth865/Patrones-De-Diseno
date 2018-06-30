/**
 * aliot
 * 01-jul-2018
 */
package laberinto;

/**
 * The Class Habitacion.
 */
public class Habitacion extends LugarDelMapa {

	/** The lados. */
	private final LugarDelMapa[] lados = new LugarDelMapa[4];

	/** The numero de habitacion. */
	private final int numeroDeHabitacion;

	/**
	 * Instantiates a new habitacion.
	 *
	 * @param numeroDeHabitacion
	 *            the numero de habitacion
	 */
	public Habitacion(int numeroDeHabitacion) {
		this.numeroDeHabitacion = numeroDeHabitacion;
	}

	/** {@inheritDoc} */
	@Override
	public void entrar() {
		System.out.println("Entro en la habitacion: " + this.numeroDeHabitacion);
	}

	/**
	 * Obtener lado.
	 *
	 * @param direccion
	 *            the direccion
	 * @return the lugar del mapa
	 */
	public LugarDelMapa obtenerLado(Direccion direccion) {
		switch (direccion) {
		case NORTE:
			return this.lados[0];
		case SUR:
			return this.lados[1];
		case ESTE:
			return this.lados[2];
		case OESTE:
			return this.lados[3];
		default:
			throw new IllegalArgumentException("Direccion no valida");
		}
	}

	/**
	 * Establecer lado.
	 *
	 * @param direccion
	 *            the direccion
	 * @param lugarDelMapa
	 *            the lugar del mapa
	 */
	public void establecerLado(Direccion direccion, LugarDelMapa lugarDelMapa) {
		switch (direccion) {
		case NORTE:
			this.lados[0] = lugarDelMapa;
		case SUR:
			this.lados[1] = lugarDelMapa;
		case ESTE:
			this.lados[2] = lugarDelMapa;
		case OESTE:
			this.lados[3] = lugarDelMapa;
		default:
			throw new IllegalArgumentException("Direccion no valida");
		}
	}

	/**
	 * Gets the numero de habitacion.
	 *
	 * @return the numero de habitacion
	 */
	public int getNumeroDeHabitacion() {
		return this.numeroDeHabitacion;
	}

}
