package ar.edu.unlam.pb1.finalAgosto;

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
	private int celular;
	private String email;
	private String direccion;
	private int codigoPostal;
	private String localidad;
	//private enum Provincia;
	private boolean esCliente;
	private boolean deseaLlamada;
	
	public void esEmailValido(String eMail) {
		/*
		 * Eval�a si un String determinado puede ser almacenado como E-MAIL.
		 */
	}
	
	public boolean registrarNuevaLlamada(Llamada nueva) {
		/*
		 * Registra una nueva llamada asociada al contacto actual.
		 */
		return false;
	}
	
	public String toString() {
		/*
		 * Muestra los datos de un contacto, entre los que se debe incluir el registro de las llamadas realizadas.
		 */
		
		return "";
	}
	
}
