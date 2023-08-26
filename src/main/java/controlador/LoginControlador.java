/**
 * 
 */
package controlador;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author NATALIA
 * 
 */
@ManagedBean(name = "login")
public class LoginControlador {
	/**
	 * Usuario ingresado en el login
	 */
	private String usuario;
	/**
	 * Contraseña ingresada en el login
	 */
	private String contrasenia;

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the contrasenia
	 */
	public String getContrasenia() {
		return contrasenia;
	}

	/**
	 * @param contrasenia the contrasenia to set
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * Metodo que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		if (usuario.equals("desarrollador") && contrasenia.equals("123456789")) {
			this.redireccionar("principal.xhtml");
		} else {
			String stringMessage = "Security has been incorrectly";
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, stringMessage, stringMessage);
			FacesContext.getCurrentInstance().addMessage("formLogin.txtUsuario", message);
		}
	}

	/**
	 * Metodo que permite redireccionar a otra pagina
	 * 
	 * @param pagina
	 */
	public void redireccionar(String pagina) {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext(); // Permite redireccionar a otra
																						// pagina
		try {
			ec.redirect(pagina);
		} catch (Exception e) {
			String stringMessage = "Ocurrio un error al redireccionar la pagina";
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, stringMessage, stringMessage);
			FacesContext.getCurrentInstance().addMessage("formLogin.txtUsuario", message);
		}
	}

}
