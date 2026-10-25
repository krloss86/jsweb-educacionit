package clase8;

import clase5.CLAVES_VALIDAS;

public class MapInterfaces {

	public static void main(String[] args) {
				
		CrearDeOrdenables co = new CrearDeOrdenables();
		
		for(CLAVES_VALIDAS myEnum : CLAVES_VALIDAS.values()) {
			IOrdenable ordenador = co.getOrdenable(myEnum);
			ordenador.ordenar();
		}
			
		/*TABLA DE PARAMETROS:
		 * prestamo:
		 * todos los prestamos tienen valiadaciones
		 * 
		 * tipos de prestamos
		 - prefi expo : pretamo de exportacion
		  > logica:
		  > validaciones
		  
		 - pres impo : prestamos de importacion
		 
		*/
	}
}
