package clase6;

import java.sql.SQLException;
import java.util.List;

import clase7.domain.ArticuloEntity;

public class MainListarArticulos {

	public static void main(String[] args) throws SQLException {
		DbManager dbManager = new DbManager();
		
		ArticuloService as = new ArticuloService(dbManager);
		
		List<ArticuloEntity> articulos = as.listarArticulos();
		
		System.out.println("Listado de articulos:");
		
		for (ArticuloEntity articulo : articulos) {
			System.out.println("ID: " + articulo.getId() + ", Titulo: " + articulo.getTitulo() + ", Codigo: " + articulo.getCodigo() + ", Precio: " + articulo.getPrecio() + ", Tipo: " + articulo.getTipo());
		}
		
	}

}
