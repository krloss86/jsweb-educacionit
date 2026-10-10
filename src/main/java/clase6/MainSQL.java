package clase6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainSQL {

	public static void main(String[] args) throws SQLException {
		// 1) conectarse a la base de datos
		Connection conn = DbManager.getConnection();
		
		// 2) consultar la base de datos
		//select * from artiuculos
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM articulos");
		
		ResultSet rs = ps.executeQuery();
		
		//extraigo dados
		while(rs.next()) {
			Integer id = rs.getInt("id");
			String titulo = rs.getString("titulo");
			String codigo = rs.getString("codigo");
			Double precio = rs.getDouble("precio");
			Integer tipo = rs.getInt("tipo");
			
			System.out.println("id: " + id + ", titulo: " + titulo + ", codigo: " + codigo + ", precio: " + precio + ", tipo: " + tipo);
		}
		
		
		// 2) cerrar la conexión
		DbManager.closeConnection(conn);
	}

}
