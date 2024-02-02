package Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Servicios.MenuImplementacion;
import Servicios.MenuInterfaz;
import Servicios.OperacionImplementacion;
import Servicios.OperacionInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		MenuInterfaz mi = new MenuImplementacion();
		OperacionInterfaz oi = new OperacionImplementacion();
		
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<Integer>();
		
		int opcionUsuario;
		boolean cerrarMenu=false;
		
		while(!cerrarMenu) {
			
			opcionUsuario = mi.MenuYSeleccion(sc);
			System.out.println(opcionUsuario);
			
			switch(opcionUsuario) {
			
			case 0:
				System.out.println("Has seleccionado cerrar Menu");
				cerrarMenu= true;
				break;
				
			case 1:
				System.out.println("Has seleccionado aniadir numero");
				oi.aniadirNumero(lista, sc);
				oi.bucleFor(lista);
				break;
				
			case 2:
				System.out.println("Has seleccionado intercambiar numeros");
				oi.intercambiarPosicion(lista);
				oi.bucleForeach(lista);
				break;
											
				default:
					System.out.println("No coincide con ninguna opcion");				
					break;
			}
		}

	}

}
