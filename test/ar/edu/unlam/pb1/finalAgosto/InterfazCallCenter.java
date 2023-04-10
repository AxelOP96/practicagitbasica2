package ar.edu.unlam.pb1.finalAgosto;

import java.util.Scanner;

public class InterfazCallCenter {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String args[]) {
		menu();	
		Empresa tuenti = null;
		int opcion = teclado.nextInt();
	}
	
	private static void incorporarZonaDeCobertura() {
		/*
		 * Se registra un nuevo c�digo postal dentro de la zona de cobertura de la empresa
		 */
		System.out.println("Ingrese un codigo postal");
		int codigo = teclado.nextInt();
		//tuenti.agregarZonaDeCobertura(codigo);
	}
	
	private static void darDeAltaNuevoContacto() {
		/*
		 * Registra un nuevo contacto en la empresa
		 */
	}
	
	private static void realizarNuevaLlamada() {
		/*
		 * Busca un candidato,  muestra los datos del mismo, y permite almacenar el resultado de la llamada.
		 * 
		 * a.	Si la llamada fue exitosa (en ese caso el contacto pasa a ser cliente, y no se lo debe volver a 
		 * llamar).
		 * b.	Si el contacto no desea ser llamado nuevamente (la llamada pudo no haber sido exitosa, pero se haga 
		 * un nuevo intento en el futuro).
		 * c.	Observaciones: Texto libre donde el operador deja registro de lo conversado.
		 */
	}
	
	private static void verInformacionDelContacto() {
		/*
		 * Se visualiza la informaci�n del contacto, incluso el listado de las llamadas que se le hicieron
		 */
	}
	private static void menu() {
		System.out.println("Bienvenido al callcenter");
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Incorporar zona de cobertura");
		System.out.println("2 - Dar de alta un nuevo contacto");
		System.out.println("3 - Realizar nueva llamada");
		System.out.println("4 - Ver informaci�n del contacto");
		System.out.println("9 - Salir");
		System.out.println("************************");
	}
	
}
