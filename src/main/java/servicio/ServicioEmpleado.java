/**
 * 
 */
package servicio;

import java.util.ArrayList;
import java.util.List;

import modelo.Empleado;

/**
 * @author NATALIA
 * 
 *         Clase que permite realizar la logica del negocio para empleados.
 */
public class ServicioEmpleado {
	/**
	 * Metodo que permite consultar la lista de empleados de la empresa TI.
	 * 
	 * @return {@link Empleado} lista de empleados
	 */
	public List<Empleado> consultarEmpleados() {
		// Generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado1 = new Empleado("Maria", "Natalia", "Benavides", "Sanabria", true, "Desarrollador");
		Empleado empleado2 = new Empleado("Cristian", "Camilo", "Ramirez", "Cipagauta", true, "Gerente");
		Empleado empleado3 = new Empleado("Edgar", "Mauricio", "Benavides", "Sanabria", true, "Ventas");
		Empleado empleado4 = new Empleado("Maria", "", "Sanabria", "Velandia", false, "Marketing");

		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);

		return empleados;

	}

}
