package clase8;

import java.util.HashMap;
import java.util.Map;

import clase5.Request;

public class MapClaseValor {

	public static void main(String[] args) {
		Map<Request, String> mapClaseTexto = new HashMap<Request, String>();
		
		mapClaseTexto.put(new Request("algo"), "Texto");
		mapClaseTexto.put(new Request("otra cosa"), "Texto");
		
		System.out.println(mapClaseTexto);
		
		for(var kv : mapClaseTexto.entrySet() ) {
			Request k = kv.getKey();
			String v = kv.getValue();
			
			System.out.println(k.getClave());
			System.out.println(v);
			
		}
	
	}
}
