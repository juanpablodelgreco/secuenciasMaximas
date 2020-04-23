package secuenciasMaximas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		int numero = 7;
		SecuenciaMaxima sm = new SecuenciaMaxima("./lote_de_pruebas/Inputs/"+numero+".in", "./lote_de_pruebas/Outputs/"+numero+".out");
		sm.obtenerSecuenciaMaxima();
	}
	
	public static void casoFatiga() {
		String path = "./lote_de_pruebas/Inputs/7.in";
		try {
			PrintWriter pw = new PrintWriter(new File(path));
			pw.println(1000);
			for(int i=1; i<=1000; i++) {
				pw.println(i);
			}
			System.out.println(path+" generado con exito!");
			pw.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo crear el archivo "+path);
		}
	
	}
}
