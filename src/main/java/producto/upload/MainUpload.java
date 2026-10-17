package producto.upload;

import java.io.File;

public class MainUpload {

	public static void main(String[] args) {
		File file = new File("/home/carlos/js18");
		
		if(file.exists()) {
			System.out.println("El archivo existe");
		} else {
			System.out.println("El archivo no existe");
		}
		
		if(file.isFile()) {
			System.out.println("Es un archivo");
		} else {
			System.out.println("No es un archivo");
		}
		
		if(file.isDirectory()) {
			System.out.println("Es un directorio");
		} else {
			System.out.println("No es un directorio");
		}
		
		String[] filesIND = file.list();
		if(filesIND != null) {
			for(String f : filesIND) {
				System.out.println(f);
			}
		} else {
			System.out.println("No se pudo listar el contenido del directorio");
		}
		
		File file2 = new File("/home/carlos/js18/productos.csv");
		if(file2.exists()) {
			System.out.println("El archivo productos.csv existe");
			
			//leer el contenido del archivo productos.csv
			try {
				java.util.Scanner sc = new java.util.Scanner(file2);
				while(sc.hasNextLine()) {
					String line = sc.nextLine();
					//1;abc1;titu1;14501;1
					// puedo parsear la linea con split
					// convertir a un objeto ProductoDTO
					// los meto en un arraylist de ProductoDTO
					System.out.println(line);
				}
				sc.close();
			} catch (Exception e) {
				System.out.println("Error al leer el archivo productos.csv: " + e.getMessage());
			}
		} else {
			System.out.println("El archivo productos.csv no existe");
		}
	}
}
