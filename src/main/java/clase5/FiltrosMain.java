package clase5;

public class FiltrosMain {

	
	//clase que recibe las peticiones desde un FRONT, MOBILE, WE, ETC....
	public static void main(String[] args) {
		Request request = new Request("ORDEN");
		//request-> parametros que envia el cliente
		
		//¿el request envia un clave de ordenamiento valida?

		assertValid(request.getClave());//un string que viene desde el cliente
		
		System.out.println("OK");
	}

	public static void assertValid(String clave) {
		//validar contra mi enum
		
		//CLAVES_VALIDAS.valueOf(clave);
		
		boolean existe = false;
		
		for(CLAVES_VALIDAS value : CLAVES_VALIDAS.values()) {
			if(value.name().equals(clave)) {
				existe = true;
				break;
			}
		}
		
		if(!existe)
			throw new RuntimeException("Clave invalida");
	}
}
