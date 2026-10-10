package clase6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ArticuloService {

	//obtner la conexion a la base de datos
	private Connection conn;
	
	public ArticuloService(DbManager dbManager) {
		conn = DbManager.getConnection();
	}
	
	public ArticuloEntity crearArticulo(ArticuloDTO articuloDTO) throws SQLException {
		//dado el DTO, crear un Entity objeto Articulo
		
		ArticuloEntity articulo = new ArticuloEntity(
			articuloDTO.getTitulo(),
			articuloDTO.getCodigo(),
			articuloDTO.getPrecio(),
			articuloDTO.getTipo()
		);				
		
		//armar el sql de insert												   1  2  3  4
		String sql = "INSERT INTO articulos (titulo, codigo, precio, tipo) VALUES (?, ?, ?, ?)";
		
		//preparar el statement
		PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		//setear los parametros del statement
		ps.setString(1, articulo.getTitulo());
		ps.setString(2, articulo.getCodigo());
		ps.setDouble(3, articulo.getPrecio());
		ps.setInt(4, articulo.getTipo());
		
		//ejecutar el sql de insercion
		int affectRows = ps.executeUpdate();
		
		// obtener el id generado
		if (affectRows > 0) {
			ResultSet generatedKeys = ps.getGeneratedKeys();
			if (generatedKeys.next()) {
				articulo.setId(generatedKeys.getInt(1));
			} 
		}
		
		//cierro la conexiones
		this.conn.close();
		
		//retornar el articulo creado con su id
		return articulo;
	}

	public List<ArticuloEntity> listarArticulos() throws SQLException {
		List<ArticuloEntity> articulos = new ArrayList<>();
		
		String sql = "SELECT * FROM articulos";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			ArticuloEntity articulo = new ArticuloEntity(
				rs.getInt("id"),
				rs.getString("titulo"),
				rs.getString("codigo"),
				rs.getDouble("precio"),
				rs.getInt("tipo")
			);
			articulos.add(articulo);
		}
		
		this.conn.close();
		
		return articulos;
	}

	public void eliminarPorId(Integer id) throws SQLException {
		String sql = "DELETE FROM articulos WHERE id = ?";
		PreparedStatement ps = conn.prepareStatement(sql); // SQL Injection safe
		ps.setInt(1, id);
		int aux = ps.executeUpdate();
		
		if(aux > 0) {
			System.out.println("Articulo con ID " + id + " eliminado correctamente.");
		} else {
			System.out.println("No se encontró un articulo con ID " + id + ".");
		}
		
		this.conn.close();
	}
}
