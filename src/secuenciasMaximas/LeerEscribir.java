package secuenciasMaximas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LeerEscribir {

	public void leerArchivo(SecuenciaMaxima sm) {
		try {
			Scanner sc = new Scanner(new File(sm.getInputPath()));
			Numero[] n = new Numero[sc.nextInt()];
			for(int i=0; i<n.length; i++) {
				Numero num = new Numero(sc.nextInt());
				n[i] = num;
			}
			sm.setNumeros(n);
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo "+sm.getInputPath());
		}
	}

	public void escribirArchivo(SecuenciaMaxima sm) {
		try {
			PrintWriter pw = new PrintWriter(new File(sm.getOutputPath()));
			pw.println(sm.getCantidadNumeros());
			pw.println(sm.getNumerosConsecutivos());
			pw.close();
			System.out.println("Se genero el archivo "+sm.getOutputPath()+" con exito!");
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo generar el archivo "+sm.getOutputPath());
		}
		
		
	}

}
