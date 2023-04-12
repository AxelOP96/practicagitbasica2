package ar.edu.unlam.pb1.finalAgosto;

import java.util.Arrays;

public class Contacto {
	
	/*
	 * Se deben incorporar los atributos necesarios.
	 * 
	 * �	Nombre y Apellido: No se aceptan n�meros.
	 * �	Celular: Compuesto del c�digo de pa�s + c�digo de �rea + n�mero de celular.
	 * �	E-Mail: Debe contener al menos el s�mbolo �@� y el caracter �.�.
	 * �	Direcci�n: Valor alfanum�rico.
	 * �	C�digo Postal: Valor num�rico.
	 * �	Localidad: Valor alfanum�rico.
	 * �	Provincia. Enumerador que contenga las 23 provincias argentinas.
	 * �	Es cliente (Si o No): Inicialmente se carga en �No�.
	 * �	Desea ser llamado nuevamente (Si o No): Inicialmente se carga en �Si�.
	 * 
	 */
	private String nombre;
	private Integer celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean deseaLlamada;
	private Llamada[] registroDeLLamadas = new Llamada[50] ;
	
	public Contacto(){
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.provincia = provincia;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.esCliente = esCliente;
		this.deseaLlamada = deseaLlamada;
		this.registroDeLLamadas = new Llamada[50];
	}
	public Contacto(String nombre, Integer celular, Integer codigoPostal, String email) {
		this.nombre = nombre;
		this.celular = celular;
		this.email = email;
		this.codigoPostal = codigoPostal;
		this.esCliente = true;
		this.deseaLlamada = true;
		this.registroDeLLamadas = new Llamada[50];
		this.provincia = provincia;
		this.direccion = direccion;
		this.localidad = localidad;
	}
	public void esEmailValido(String eMail) {
		/*
		 * Eval�a si un String determinado puede ser almacenado como E-MAIL.
		 */
//		for(int i=0;i<eMail.length();i++) {
//			if(eMail.su == "@") {
//				
//			}
//		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}

	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}

	public Boolean getDeseaLlamada() {
		return deseaLlamada;
	}

	public void setDeseaLlamada(Boolean deseaLlamada) {
		this.deseaLlamada = deseaLlamada;
	}

	public boolean registrarNuevaLlamada(Llamada nueva) {
		/*
		 * Registra una nueva llamada asociada al contacto actual.
		 */
		boolean registrada = false;
		for(int i=0; i < 50;i++) {
			if(registroDeLLamadas[i] != null) {
				registroDeLLamadas[i]= nueva;
				registrada = true;
			}
		}
		return registrada;
	}
	
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", celular=" + celular + ", email=" + email + ", direccion=" + direccion
				+ ", codigoPostal=" + codigoPostal + ", localidad=" + localidad + ", provincia=" + provincia
				+ ", esCliente=" + esCliente + ", deseaLlamada=" + deseaLlamada + ", registroDeLLamadas="
				+ Arrays.toString(registroDeLLamadas) + "]";
	}
	
}
