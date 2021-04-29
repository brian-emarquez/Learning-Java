package domain;

public class Gerente extends Empleado{
	private String departamento;
	
	public Gerente(String nombre, double sueldo, String departamento) {
		super(nombre, sueldo);
		this.departamento = departamento;
	}
	
	@Override /*Anotacion - modifica el conportamento de metodos*/
	public String obtenerDetalles() {
		return super.obtenerDetalles() + ", departamento " + this.departamento ;
		
	}
	
}
