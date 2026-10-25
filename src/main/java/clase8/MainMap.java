package clase8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainMap {

	public static void main(String[] args) {

		Map<NumerosDiasENUM, DiasENUM> diasDeLaSemana = new HashMap<>();

		//agrega
		diasDeLaSemana.put(NumerosDiasENUM.UNO, DiasENUM.LUNES);
		diasDeLaSemana.put(NumerosDiasENUM.DOS, DiasENUM.MARTES);
		/*diasDeLaSemana.put(3, "Miercoles");
		diasDeLaSemana.put(4, "Jueves");
		diasDeLaSemana.put(5, "Viernes");
		diasDeLaSemana.put(6, "Sabado");
		diasDeLaSemana.put(7, "Domingo");*/
		
		//obtengo un valor
		DiasENUM dia = diasDeLaSemana.get(NumerosDiasENUM.DOS);
		System.out.println(dia);
		
		//actualizo un valor
		diasDeLaSemana.put(1, "Dia Lunes");
		dia = diasDeLaSemana.get(1);
		System.out.println(dia);
		
		//elimino un valor del mapa
		String diaEliminado = diasDeLaSemana.remove(5);
		System.out.println(diasDeLaSemana);
		
		System.out.println(diaEliminado);
		
		//obtener todos los valores
		Collection<String> values = diasDeLaSemana.values();
		for(String v : values) {
			System.out.println(v);
		}
		
		//obtener las keys
		Set<Integer> keys = diasDeLaSemana.keySet();
		System.out.println(keys);
		
		Set<Entry<Integer,String>> par = diasDeLaSemana.entrySet();
		//var entry = Map.entry(5, "Viernes");
		//par.add(entry); TPH ver el fallo
				
		//recorrer un entryset
		for(Entry<Integer,String> keyValue : par) {
			Integer k = keyValue.getKey();
			String v = keyValue.getValue();
			
			System.out.println(k + "-" +v);
		}
	}

}
