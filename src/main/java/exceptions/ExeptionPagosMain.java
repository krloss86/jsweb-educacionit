package exceptions;

import java.util.Scanner;

public class ExeptionPagosMain {

	public static void main(String[] args) {
		System.out.println("ingrese un monto");
		
		Scanner teclado = new Scanner(System.in);
		
		Float monto = teclado.nextFloat();
		
		PasarelaPagos pasarela = new PasarelaPagos();
		try {
			pasarela.pagar(monto);
			
		} catch (MontoInvalidoException e) {
			e.printStackTrace();
			if(true) {
				throw new RuntimeException("fin");
			}
		} catch (RequiereValidarIdentidadException e) {
			e.printStackTrace();
		} catch (TimeOutExeption e) {
			e.printStackTrace();
		} finally {			
			System.err.println("Cerrando teclado");
			teclado.close();			
		}
		
	}
}
