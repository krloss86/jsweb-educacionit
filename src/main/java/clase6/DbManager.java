package clase6;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * DbManager proporciona una forma simple de obtener una conexión JDBC.
 *
 * Prioridad para la configuración:
 * 1) Variables de entorno: DB_URL, DB_USER, DB_PASSWORD, DB_DRIVER
 * 2) Archivo classpath `application.properties` con propiedades: db.url, db.user, db.password, db.driver
 * 3) Valor por defecto: H2 en memoria (útil para desarrollo si no hay configuración)
 */
public class DbManager {

	public static  Connection getConnection() {
		String url = System.getenv("DB_URL");
		String user = System.getenv("DB_USER");
		String password = System.getenv("DB_PASSWORD");
		String driver = System.getenv("DB_DRIVER");

		// Si alguna propiedad no está en env, intentar cargar desde application.properties
		if ((url == null || url.isEmpty()) || user == null || password == null || driver == null) {
			Properties props = new Properties();
			try (InputStream in = DbManager.class.getClassLoader().getResourceAsStream("application.properties")) {
				if (in != null) {
					props.load(in);
				}
			} catch (IOException e) {
				// No detener la ejecución: se usarán valores por defecto o variables de entorno si están presentes
			}

			if ((url == null || url.isEmpty())) {
				url = props.getProperty("db.url", url);
			}
			if (user == null) {
				user = props.getProperty("db.user", user);
			}
			if (password == null) {
				password = props.getProperty("db.password", password);
			}
			if (driver == null) {
				driver = props.getProperty("db.driver", driver);
			}
		}
	

		if (driver != null && !driver.isEmpty()) {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("No se encontró la clase del driver JDBC: " + driver, e);
			}
		}

		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new RuntimeException("Error al obtener la conexión a la base de datos: " + e.getMessage(), e);
		}
	}

	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new RuntimeException("Error al cerrar la conexión a la base de datos: " + e.getMessage(), e);
			}
		}
	}
}
