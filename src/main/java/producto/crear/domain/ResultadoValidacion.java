package producto.crear.domain;

import java.util.ArrayList;
import java.util.List;

public class ResultadoValidacion {

	private List<Error> resultado = new ArrayList<>();
		
	public void addError(String campos, String mensaje) {
		this.resultado.add(new Error(campos, mensaje));
	}
	
	public boolean hayErrores() {
		return !this.resultado.isEmpty();
	}
	
	public List<Error> getErrores() {
		return this.resultado;
	}
}
