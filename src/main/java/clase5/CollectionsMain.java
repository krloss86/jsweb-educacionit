package clase5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionsMain {

	public static void main(String[] args) {
		int[] valores = new int[] {1,2,3};
		valores[2] = 2;
		
		Contenedor<String> contenedorString = new Contenedor<String>("Hola");
		
		System.out.println(contenedorString.getValue());
		
		Collection<String> colString = new ArrayList<String>();
		//List<String> arrStrin = new ArrayList<String>();
		
		//metodos mas comunes
		colString.add("uno");
		colString.add("dos");
		colString.add("tres");
		//System.out.println(colString);
		
		//colString.remove("uno");
		System.out.println(colString);
		
		//iterar una coleccion
		for(String aux : colString) {
			//System.out.println(aux);
			//colString.remove(aux);
		}
		
		//iterar para poder eliminar
		Iterator<String> itString = colString.iterator();
		while(itString.hasNext()) {
			String aux = itString.next();
			if(aux.equals("dos"))
				itString.remove();
		}
		System.out.println(colString);
		
		Collection<Cliente> clientes = CrearClientes.crearCliente();
		System.out.println(clientes);
	}
}
