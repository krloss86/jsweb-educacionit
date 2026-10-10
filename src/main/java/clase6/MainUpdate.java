package clase6;

import java.util.Scanner;

public class MainUpdate {

	public static void main(String[] args) throws Exception {
		ArticuloService articuloService = new ArticuloService(new DbManager());
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el ID del articulo a actualizar: ");
		Integer id = scanner.nextInt();
		
		ArticuloEntity articulo = articuloService.buscarPorId(id);
		if(articulo == null) {
			System.out.println("Articulo con ID " + id + " no encontrado.");
			scanner.close();
			return;
		}

		System.out.println("Articulo encontrado: " + articulo.getTitulo() + ", " + articulo.getCodigo() + ", " + articulo.getPrecio() + ", " + articulo.getTipo());
		//leer datos de consola usando Scanner
		System.out.print("Ingrese el nuevo titulo del articulo: ");
		scanner.nextLine(); // limpiar buffer
		String titulo = scanner.nextLine();
		System.out.print("Ingrese el nuevo codigo del articulo: ");
		String codigo = scanner.nextLine();
		System.out.print("Ingrese el nuevo precio del articulo: ");
		Double precio = scanner.nextDouble();
		System.out.print("Ingrese el nuevo tipo del articulo: ");
		Integer tipo = scanner.nextInt();
		scanner.close();
		
		//crar un DTO con los datos leidos
		ArticuloDTO articuloDTO = new ArticuloDTO(titulo, codigo, precio, tipo);
		
		//TODO CORREGIR
		articuloService = new ArticuloService(new DbManager());
		articuloService.actualizarArticulo(id, articuloDTO);
		System.out.println("Articulo actualizado con ID: " + id);
		
	}

}
