package secuenciasMaximas;

public class SecuenciaMaxima {
	private String inputPath;
	private String outputPath;
	private Numero[] numeros;
	private int cantidadNumeros = 0;
	private int numerosConsecutivos = 0;

	public SecuenciaMaxima(String inputPath, String outputPath) {
		this.inputPath = inputPath;
		this.outputPath = outputPath;
	}

	public void obtenerSecuenciaMaxima() {
		int numCons = 0;
		int maxNumerosConsecutivos = 0;
		LeerEscribir l = new LeerEscribir();
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
		l.escribirArchivo(this);
	}

	public void setNumeros(Numero[] numeros) {
		this.numeros = numeros;
	}

	public String getInputPath() {
		return inputPath;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public int getCantidadNumeros() {
		return cantidadNumeros;
	}

	public int getNumerosConsecutivos() {
		return numerosConsecutivos;
	}
}
