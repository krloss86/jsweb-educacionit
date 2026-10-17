package clase7.application;

import clase7.domain.ProductoDAO;
import clase7.domain.ProductoRequest;
import clase7.infrastructure.MysqlProductoDAOImpl;
import clase7.infrastructure.ProductoRequestValidador;
import clase7.infrastructure.ProductoService;

public class Front {

	/*
	 * recibir los datos de entrada del usuario, por ejemplo desde la consola o desde una interfaz gráfica
	 */
	public static void main(String[] args) throws Exception {
		
		if(args.length < 4) {
			System.out.println("Uso: java Front <titulo> <codigo> <precio> <tipo>");
			return;
		}
		
		String titulo = args[0].split("=")[1];
		String codigo = args[1].split("=")[1];;
		Double precio = Double.parseDouble(args[2].split("=")[1]);
		Integer tipo = Integer.parseInt(args[3].split("=")[1]);
		
		// crear un objeto ProductoRequest con los datos de entrada
		ProductoRequest request = new ProductoRequest(titulo, codigo, precio, tipo);
		
		// crear un objeto CrearProducto con las dependencias necesarias
		ProductoDAO dao = new MysqlProductoDAOImpl();
		
		CrearProducto crearProductoUC = new CrearProducto(
			new ProductoService(dao),
			new ProductoRequestValidador()
		);
		
		crearProductoUC.invocar(request);
	}
}
