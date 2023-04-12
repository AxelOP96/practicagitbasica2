package ar.edu.unlam.pb1.finalAgosto;

public class Empresa {

	/*
	 * Se deben incorporar los atributos necesarios.
	 */
	private String nombre;
	private boolean agregado;
	private int zonaDeCobertura[] ;
	private Contacto[] listaDeContactos;
	
	public Empresa() {
		this.nombre = nombre;
		this.agregado = agregado;
		this.zonaDeCobertura = new int[100];
		this.listaDeContactos = new Contacto[100];
	}
	
	public String getNombreEmpresa() {
		/*
		 * Devuelve el nombre de la empresa
		 */
		
		return this.nombre;
	}
	
	public boolean agregarNuevoContacto(Contacto nuevo) {
	
		/*
		 * Incorpora un nuevo contacto a la empresa
		 */
		boolean agregado = false;
		for(int i=0;i<100;i++) {
			if(listaDeContactos[i] == null) {
				listaDeContactos[i] = nuevo;
				agregado = true;
				break;
			}
		}
		return agregado;
	}
	
	public boolean agregarNuevaZonaDeCobertura(int codigoPostal) {
		/*
		 * Incorpora una nueva zona de cobertura (Las zonas de cobertura se identifican por el codigo postal)
		 */
		boolean zonaAgregada = false;
		for(int i=0; i< 100;i++) {
			if(zonaDeCobertura[i] == 0) {
				zonaDeCobertura[i] = codigoPostal;
				zonaAgregada = true;
				break;
			}
		}
		return zonaAgregada;
	}	
	
	private boolean elCodigoPostalEstaDentroDeLaZonaDeCobertura(int codigoPostal) {
		/*
		 * Determina si un c�digo postal est� dentro de la zona de cobertura
		 */
		boolean estaDentro = false;
		for(int i=0;i<100;i++) {
			if(zonaDeCobertura[i] == codigoPostal && zonaDeCobertura[i]!= 0) {
				estaDentro = true;
			}
		}
		return estaDentro;
	}
	
	public Contacto buscarCandidato() {
		/*
		 * Para determinar qu� contacto el sistema debe mostrar, se debe realizar la siguiente b�squeda:
		 * 1.	El contacto NO debe ser cliente a�n.
		 * 2.	El contacto desea ser llamado o al menos no inform� lo contrario.
		 * 3.	El c�digo postal del contacto debe existir en las zonas de cobertura existente.
		 * 4.	Del conjunto de contactos resultante se debe seleccionar aleatoriamente el pr�ximo llamado.
		 */
		Contacto buscado = null;
		if(buscado.getEsCliente() == true && buscado.getDeseaLlamada() && elCodigoPostalEstaDentroDeLaZonaDeCobertura(buscado.getCodigoPostal())) {
			
		}
		
		return buscado;
	}
}
