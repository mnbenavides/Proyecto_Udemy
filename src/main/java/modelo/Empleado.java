/**
 * 
 */
package modelo;

/**
 * @author NATALIA Clase que representa entidades de empleados.
 */
public class Empleado {
	/**
	 * Primer nombre del empleado
	 */
	private String primer_nombre;
	/**
	 * Segundo nombre del empleado
	 */
	private String segundo_nombre;
	/**
	 * Primer apellido del empleado
	 */
	private String primer_apellido;
	/**
	 * Segundo apellido del empleado
	 */
	private String segundo_apellido;
	/**
	 * Estado actual del empleado
	 */
	private Boolean estatus;
	/**
	 * Cargo que pertenece en el empleado en la empresa
	 */
	private String cargo;

	/**
	 * @param primer_nombre
	 * @param segundo_nombre
	 * @param primer_apellido
	 * @param segundo_apellido
	 * @param estatus
	 * @param cargo
	 */
	public Empleado(String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido,
			Boolean estatus, String cargo) {
		super();
		this.primer_nombre = primer_nombre;
		this.segundo_nombre = segundo_nombre;
		this.primer_apellido = primer_apellido;
		this.segundo_apellido = segundo_apellido;
		this.estatus = estatus;
		this.cargo = cargo;
	}
	/**
	 * @return the primer_nombre
	 */
	public String getPrimer_nombre() {
		return primer_nombre;
	}

	/**
	 * @param primer_nombre the primer_nombre to set
	 */
	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	/**
	 * @return the segundo_nombre
	 */
	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	/**
	 * @param segundo_nombre the segundo_nombre to set
	 */
	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	/**
	 * @return the primer_apellido
	 */
	public String getPrimer_apellido() {
		return primer_apellido;
	}

	/**
	 * @param primer_apellido the primer_apellido to set
	 */
	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	/**
	 * @return the segundo_apellido
	 */
	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	/**
	 * @param segundo_apellido the segundo_apellido to set
	 */
	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	/**
	 * @return the estatus
	 */
	public Boolean getEstatus() {
		return estatus;
	}

	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(Boolean estatus) {
		this.estatus = estatus;
	}

	/**
	 * @return the cargo
	 */
	public String getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
