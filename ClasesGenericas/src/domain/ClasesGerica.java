package domain;

import java.util.LinkedList;
import java.util.List;

public class ClasesGerica {
	public static void main(String[] args) {
		
		Nodo nodo = new Nodo();
		nodo.setValor("Hello");
		
		Nodo<Integer>nodoEntero= new Nodo<>();
		nodoEntero.setValor(25);
		
		Nodo<String> nodoString = new Nodo<>();
		nodoString.setValor("Brian");
	}
}
