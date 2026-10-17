package clase7.application;

import clase6.ArticuloDTO;
import clase7.domain.IValidable;
import clase7.domain.ProductoRequest;
import clase7.domain.ResultadoValidacion;
import clase7.infrastructure.ProductoService;

/**
 * Caso de uso: Crear un producto
 * 
 * Esta clase representa el caso de uso de crear un producto en el sistema.
 * Recibe un ProductoRequest con los datos necesarios para crear el producto y
 * delega la lógica de negocio al ProductoService.
 */
public class CrearProducto {

	private ProductoService productoService;
	private IValidable<ProductoRequest> validador;
	
	//recibe las dependencias necesarias para ejecutar la logica de negocio, por ejemplo el DAO
	public CrearProducto(
			ProductoService productoService,
			IValidable<ProductoRequest> validador
			) {
		if(productoService == null) {
			throw new IllegalArgumentException("ProductoService no puede ser nulo");
		}
		this.productoService = productoService;
		
		if(validador == null) {
			throw new IllegalArgumentException("Validador no puede ser nulo");
		}
		this.validador = validador;
	}
	
	public void invocar(ProductoRequest request) throws Exception{
		//ejecuta la logica de negocio para crear un producto
		
		//validacion de formato(tipo y dato)
		ResultadoValidacion resultado = this.validador.validate(request);
		
		if(resultado.hayErrores()) {
			//si hay errores de validacion, lanza una excepcion con los errores
			throw new Exception(resultado.getErrores().toString());
		}
		
		//si todo ok, delega la creacion del producto al servicio
		this.productoService.crearProducto(
			new ArticuloDTO(
					request.getTitulo(), 
					request.getCodigo(), 
					request.getPrecio(), 
					request.getTipo()
				)
		);
	}
	
	
}
