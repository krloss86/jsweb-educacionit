package exceptions;

public class MontoInvalidoException extends Exception{

	public MontoInvalidoException(String msj,Throwable causa) {
		super(msj,causa);
	}

}
