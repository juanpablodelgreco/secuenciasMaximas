package secuenciasMaximas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerEscribir {
	private String path;
	
	public LeerEscribir(String path) {
		this.path = path;
	}
	
	public void leerArchivo(SecuenciaMaxima sm) {
		try {
			Scanner sc = new Scanner(new File(path));
			Numero[] n = new Numero[sc.nextInt()];
			for(int i=0; i<n.length; i++) {
				Numero num = new Numero(sc.nextInt());
				n[i] = num;
			}
			sm.setNumeros(n);
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el archivo "+path);
		}
	}

}
