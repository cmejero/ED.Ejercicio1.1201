package Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.NumerosDto;

public interface OperacionInterfaz {

	
	public void bucleForeach(List<Integer> listaAntigua);
	
	public void intercambiarPosicion(List<Integer> listaAntigua);
	
	public void aniadirNumero(List<Integer> listaAntigua, Scanner sc);
	
	public void bucleFor(List<Integer> listaAntigua);
}
