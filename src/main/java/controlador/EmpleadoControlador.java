/**
 * 
 */
package controlador;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped; //La informacion se mantiene hasta que se visualice otra pantala

import modelo.Empleado;
import servicio.ServicioEmpleado;

/**
 * @author NATALIA
 * 
 *         Clase controlador que se encarga de procesar informacion para la
 *         pantalla principal.xhtml
 */
@ManagedBean(name = "empleado")
@ViewScoped
public class EmpleadoControlador {
	/**
	 * Servicio de los metodos que realiza la logica del negocio de empleados.
	 */
	private ServicioEmpleado servicio_empleado = new ServicioEmpleado();;
	/**
	 * Lista de empledos pertenecientes a la empresa TI para la tabla.
	 */
	private List<Empleado> empleados;

	/**
	 * Metodo que se encarga de inicilizar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * Metodo que permite consultar la lista de empleados de la empresa TI.
	 * 
	 */
	public void consultarEmpleados() {
		this.empleados = servicio_empleado.consultarEmpleados();
	}
}
