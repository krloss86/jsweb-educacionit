package clase7.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

import clase6.ArticuloDTO;
import clase6.DbManager;
import clase7.domain.ArticuloEntity;
import clase7.domain.ProductoDAO;

public class MysqlProductoDAOImpl implements ProductoDAO {

	//private DbManager dbManager;

	/*public MysqlProductoDAOImpl(DbManager dbManager) {
		this.dbManager = dbManager;
	}*/

	@Override
	public ArticuloEntity crearProducto(ArticuloDTO articuloDTO) throws Exception {
		
		Connection conn = DbManager.getConnection();
		
		// dado el DTO, crear un Entity objeto Articulo
		
		ArticuloEntity articulo = new ArticuloEntity(articuloDTO.getTitulo(), articuloDTO.getCodigo(),
				articuloDTO.getPrecio(), articuloDTO.getTipo());

		// armar el sql de insert 1 2 3 4
		String sql = "INSERT INTO articulos (titulo, codigo, precio, tipo) VALUES (?, ?, ?, ?)";

		// preparar el statement
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// setear los parametros del statement
		ps.setString(1, articulo.getTitulo());
		ps.setString(2, articulo.getCodigo());
		ps.setDouble(3, articulo.getPrecio());
		ps.setInt(4, articulo.getTipo());

		// ejecutar el sql de insercion
		int affectRows = ps.executeUpdate();

		// obtener el id generado
		if (affectRows > 0) {
			ResultSet generatedKeys = ps.getGeneratedKeys();
			if (generatedKeys.next()) {
				articulo.setId(generatedKeys.getInt(1));
			}
		}

		// cierro la conexiones
		conn.close();

		// retornar el articulo creado con su id
		return articulo;

	}

	@Override
	public ArticuloEntity buscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<ArticuloEntity> listarProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
