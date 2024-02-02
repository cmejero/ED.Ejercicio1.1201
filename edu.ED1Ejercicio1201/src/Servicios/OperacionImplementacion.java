package Servicios;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.NumerosDto;

public class OperacionImplementacion implements OperacionInterfaz
{
	MenuInterfaz mi = new MenuImplementacion();
	
	public void bucleForeach(List<Integer> listaAntigua) 
	{
		for(Object numero : listaAntigua){
			System.out.println(numero);
		}
	
	}
	
	public void intercambiarPosicion(List<Integer> listaAntigua) 
	{
		
		int aux = listaAntigua.get(1);
		listaAntigua.set(1, listaAntigua.get(3));
		
		listaAntigua.set(3, aux);
		
	}
	
	public void aniadirNumero(List<Integer> listaAntigua, Scanner sc) 
	{
		int numeroIntroducido;
		System.out.println("Introduzca un número");
		numeroIntroducido = sc.nextInt();
		listaAntigua.add(numeroIntroducido);
		
	}
	
	public void bucleFor(List<Integer> listaAntigua) {
		
		for(int i=0;i<listaAntigua.size();i++) {
			System.out.println(listaAntigua.get(i));
	}
	}
}
