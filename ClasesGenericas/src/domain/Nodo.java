package domain;

public class Nodo<E>{
	E valor;

	public E getValor() {
		return valor;
	}

	public void setValor(E valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", getValor()=" + getValor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
