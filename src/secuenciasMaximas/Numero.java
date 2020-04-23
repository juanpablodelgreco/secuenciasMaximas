package secuenciasMaximas;

public class Numero {
	private int valor;

	public Numero(int valor) {
		this.valor = valor;
	}

	public boolean isMult2() {
		return valor % 2 == 0;
	}

	public boolean isMult3() {
		return valor % 3 == 0;
	}

	public boolean isMult5() {
		return valor % 5 == 0;
	}

	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}
	
	

}
