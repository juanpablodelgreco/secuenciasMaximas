package secuenciasMaximas;

import java.util.Arrays;

public class SecuenciaMaxima {
	private String path;
	private Numero[] numeros;
	private int[] secuenciaMax;
	private int cantidadNumeros = 0;
	private int numerosConsecutivos = 0;

	public SecuenciaMaxima(String path) {
		this.path = path;
	}

	public void obtenerSecuenciaMaxima() {
		int numCons = 0;
		int maxNumerosConsecutivos = 0;
		LeerEscribir l = new LeerEscribir(this.path);
		l.leerArchivo(this);
		for (Numero nm : numeros) {
			if (!nm.isMult2() && !nm.isMult3() && !nm.isMult5()) {
				cantidadNumeros++;
				numCons++;
			} else if (numCons > maxNumerosConsecutivos) {
				maxNumerosConsecutivos = numCons;
				numCons = 0;
			} else {
				numCons = 0;
			}
			if (numCons > maxNumerosConsecutivos)
				maxNumerosConsecutivos = numCons;
		}
		this.numerosConsecutivos = maxNumerosConsecutivos;
		System.out.println(cantidadNumeros);
		System.out.println(numerosConsecutivos);
	}

	public void setNumeros(Numero[] numeros) {
		this.numeros = numeros;
	}

	@Override
	public String toString() {
		return "SecuenciaMaxima [path=" + path + ", numeros=" + Arrays.toString(numeros) + ", secuenciaMax="
				+ Arrays.toString(secuenciaMax) + ", longitudMax=" + cantidadNumeros + "]";
	}

}
