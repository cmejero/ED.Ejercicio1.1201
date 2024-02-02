package Servicios;
import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz
{
	
	public int MenuYSeleccion(Scanner comunicacionTeclado) {
		
		System.out.println("######################");
		System.out.println("0-Cerrar Aplicacion");
		System.out.println("1- Aniadir un Numero");	
		System.out.println("2- Cambiar la posición 2 con la 4");
		System.out.println("######################");
		int opcionSeleccionada= comunicacionTeclado.nextInt();
		return opcionSeleccionada;
		
	}
	
	
	
 
 }
	

