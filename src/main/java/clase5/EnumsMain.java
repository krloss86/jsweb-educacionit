package clase5;

public class EnumsMain {

	public static void main(String[] args) {

		//acotar valores
		//1,2,3,4
		
		//OK, ERROR, REINTENO
	}

	//cualquier numero entero en el rango de un int
	//que tiene de salida un String -> null, "", "cualquier cadena que pueda poner en un string"
	//
	public static VALORES_SALIDA getMsh (ENTEROS_PERMITIDOS a ) {
		if(a == ENTEROS_PERMITIDOS.UNO) {
			return VALORES_SALIDA.OK;
		}
		//
		
		return VALORES_SALIDA.VACIO;
	}
}
