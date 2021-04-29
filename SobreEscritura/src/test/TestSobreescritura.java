package test;

import domain.Gerente;

public abstract class TestSobreescritura {
	public static void main (String[] args) {
		Gerente gerente1 = new Gerente("Brian", 5000, "Sistemas");
		System.out.println("gerente 1 = " + gerente1.obtenerDetalles());
				
	}
	
	
}
