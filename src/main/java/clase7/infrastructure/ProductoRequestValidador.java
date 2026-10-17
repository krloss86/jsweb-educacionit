package clase7.infrastructure;

import clase7.domain.IValidable;
import clase7.domain.ProductoRequest;
import clase7.domain.ResultadoValidacion;

public class ProductoRequestValidador implements IValidable<ProductoRequest> {

	@Override
	public ResultadoValidacion validate(ProductoRequest productoRequest) {
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
