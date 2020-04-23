package secuenciasMaximas;

public class Main {

	public static void main(String[] args) {
		int numero = 7;
		SecuenciaMaxima sm = new SecuenciaMaxima("./lote_de_pruebas/Inputs/"+numero+".in", "./lote_de_pruebas/Outputs/"+numero+".out");
		sm.obtenerSecuenciaMaxima();
	}
}
