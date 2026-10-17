package clase6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import clase7.domain.ArticuloEntity;

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

	public ArticuloEntity buscarPorId(Integer id) throws SQLException {
		ArticuloEntity articulos = null;
		
		String sql = "SELECT * FROM articulos where id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
				
		if (rs.next()) {
			articulos = new ArticuloEntity(
				rs.getInt("id"),
				rs.getString("titulo"),
				rs.getString("codigo"),
				rs.getDouble("precio"),
				rs.getInt("tipo")
			);			
		}
		
		this.conn.close();
		
		return articulos;
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

		String sql = "DELETE FROM articulos WHERE id = ?";
		public void eliminarPorId(Integer id) throws SQLException {
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

	public void actualizarArticulo(Integer id, ArticuloDTO articuloDTO) throws SQLException {
		
		String sql = "UPDATE articulos SET titulo = ?, codigo = ?, precio = ?, tipo = ? WHERE id = ?";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		ps.setString(1, articuloDTO.getTitulo());
		ps.setString(2, articuloDTO.getCodigo());
		ps.setDouble(3, articuloDTO.getPrecio());
		ps.setInt(4, articuloDTO.getTipo());
		ps.setInt(5, id);
		
		int aux = ps.executeUpdate();
		
		if(aux > 0) {
			System.out.println("Articulo con ID " + id + " actualizado correctamente.");
		} else {
			System.out.println("No se encontró un articulo con ID " + id + ".");
		}
		
		this.conn.close();
	}
}
