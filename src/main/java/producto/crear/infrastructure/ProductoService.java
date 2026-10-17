package producto.crear.infrastructure;

import clase6.ArticuloDTO;
import producto.crear.domain.ProductoDAO;

public class ProductoService {

	private ProductoDAO productoDAO;
	
	// por constructor inyecto la dependencia del DAO
	// testeable, desacoplado, SOLID
	public ProductoService(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}
	
	public void crearProducto(ArticuloDTO articuloDTO) throws Exception {	
		// delegar la creacion del producto al DAO
		productoDAO.crearProducto(articuloDTO);		
	}
}
