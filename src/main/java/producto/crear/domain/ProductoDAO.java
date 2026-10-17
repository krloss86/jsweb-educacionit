package producto.crear.domain;

import java.util.Collection;

import clase6.ArticuloDTO;

public interface ProductoDAO {	
	
	public ArticuloEntity crearProducto(ArticuloDTO articuloEntity) throws Exception;
	
	public ArticuloEntity buscarProducto(Integer id) throws Exception;;
	public Collection<ArticuloEntity> listarProductos() throws Exception;;
	
}
