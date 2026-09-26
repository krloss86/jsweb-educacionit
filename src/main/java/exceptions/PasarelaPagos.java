package exceptions;

import java.io.IOException;
import java.util.Scanner;

public class PasarelaPagos implements AutoCloseable{

	private Scanner teclado;
	
	public PasarelaPagos() {
		teclado = new Scanner(System.in);
	}
	
	//< 0 -> MontoInvalidoException
	//> 10 -> RequiereValidarIdentidad
	// TimeOutOutException
	//throws se escribe cuando defino la firma del metodo
	public void pagar(Float monto) throws MontoInvalidoException,RequiereValidarIdentidadException, TimeOutExeption{
		
		if(monto < 0) {
			throw new MontoInvalidoException(monto.toString(), new Throwable("Monto < 0"));  
		}
		if(monto > 10 && monto < 15) {
			throw new RequiereValidarIdentidadException();
		}
		
		if(monto > 15 && monto < 25) {
			throw new TimeOutExeption();
		}
		System.out.println("pago exitoso");
	}
	
	public boolean pagar() throws Exception{
		System.out.println("Ingrese monto");
		Double monto = teclado.nextDouble();
		
		if(monto<0) {
			throw new Exception("Mostrando ejemplo de auto closeable");
		}
		return true;
	}
	
	@Override
	public void close() throws IOException {
		this.otroMetodo();
		this.teclado.close();
		System.out.println("se cierra el teclado");
	}

	public void otroMetodo() {
		System.out.println("mirando algo...");
	}
}
