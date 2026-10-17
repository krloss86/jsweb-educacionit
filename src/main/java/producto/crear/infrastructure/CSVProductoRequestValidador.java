package producto.crear.infrastructure;

import producto.crear.domain.IValidable;
import producto.crear.domain.ProductoRequest;
import producto.crear.domain.ResultadoValidacion;

public class CSVProductoRequestValidador implements IValidable<String> {

	@Override
	public ResultadoValidacion validate(String productoRequest) {
		// 1;abc1;titu1;14501;1

		ResultadoValidacion resultado = new ResultadoValidacion();
		
		if (productoRequest.getTitulo() == null || productoRequest.getTitulo().isEmpty()) {
			resultado.addError("titulo","El titulo es obligatorio");
		}
		
		if (productoRequest.getCodigo() == null || productoRequest.getCodigo().isEmpty()) {
			resultado.addError("codido","El codigo es obligatorio");
		}
		
		if (productoRequest.getPrecio() == null || productoRequest.getPrecio() <= 0) {
			resultado.addError("precio","El precio debe ser mayor a 0");
		}
		
		if (productoRequest.getTipo() == null || productoRequest.getTipo() < 1 || productoRequest.getTipo() > 3) {
			resultado.addError("tipo","El tipo debe ser 1, 2 o 3");
		}
		
		return resultado;
	}

}
