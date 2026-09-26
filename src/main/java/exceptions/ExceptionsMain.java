package exceptions;

import clase4.Consola;
import clase4.PlayStation;
import clase4.Xbox;

public class ExceptionsMain {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		//ArtimeticExceptions: runtime
		//System.out.println(a / b);
		
		Consola generica = new PlayStation(null, false, false, null);
		
		//class cast exception: runtime
		Xbox x = (Xbox)generica;//compilacion no hay error
		x.getNombre();
		//....
		//...
		
		try {
			//si todo ok!
			sumar();
		}catch(ClassCastException e) {
			//si ocurre alguna Exception
			//aca logica de control para algo particular
		}catch(Exception e2) {
			
		}
		
	}
	
	//un metodo lanza o genera algun tipo de error: th
	//CHECKED
	static void sumar() throws Exception,ClassCastException{
		//...
		
	}
}
