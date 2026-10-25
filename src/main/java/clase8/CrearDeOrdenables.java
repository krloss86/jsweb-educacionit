package clase8;

import java.util.HashMap;
import java.util.Map;

import clase5.CLAVES_VALIDAS;

public class CrearDeOrdenables {

	private Map<CLAVES_VALIDAS,IOrdenable> mapOrdenadores = new HashMap<>();
	
	public CrearDeOrdenables() {
		//agregando clave - valor al mapa
		//el valor es la intancia de clase que implementa la intreface
		// "expo - ar.com.bancox.PrestamosExpo"
		// "impo - ar.com.bancox.PrestamosImpo"
		
		mapOrdenadores.put(CLAVES_VALIDAS.PRECIO_ASC, new PrecioASC());
		mapOrdenadores.put(CLAVES_VALIDAS.TITULO_ASC, new TituloASC());
	}
	
	public IOrdenable getOrdenable(CLAVES_VALIDAS key) {
		if(!mapOrdenadores.containsKey(key)) {
			throw new IllegalArgumentException("No Existe " + key);
		}
		
		return mapOrdenadores.get(key);
	}
}
