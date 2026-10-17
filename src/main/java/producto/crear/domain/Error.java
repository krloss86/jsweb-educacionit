package producto.crear.domain;

public class Error {

	private String mensajeError;	
	private String campo;
	
	public Error(String mensajeError, String campo) {
		this.mensajeError = mensajeError;
		this.campo = campo;
	}
	
	public boolean hasError() {
		return mensajeError != null && !mensajeError.isEmpty();
	}
	public String getMensajeError() {
		return mensajeError;
	}
	
	public String getCampo() {
		return campo;
	}

	@Override
	public String toString() {
		return "{campo:" + campo+ ", mensajeError:" + mensajeError + "}";
	}
	
}
