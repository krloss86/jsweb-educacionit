package clase6;

import java.util.Scanner;

import clase7.domain.ArticuloEntity;

public class MainSQLInsert {

	public static void main(String[] args) {
		
		ArticuloService articuloService = new ArticuloService(new DbManager());	
		
		//leer datos de consola usndo Scanner	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el titulo del articulo: ");
		String titulo = scanner.nextLine();
		System.out.print("Ingrese el codigo del articulo: ");
		String codigo = scanner.nextLine();
		System.out.print("Ingrese el precio del articulo: ");
		Double precio = scanner.nextDouble();
		System.out.print("Ingrese el tipo del articulo: ");
		Integer tipo = scanner.nextInt();
		scanner.close();
		
		//crar un DTO con los datos leidos
		ArticuloDTO articuloDTO = new ArticuloDTO(titulo, codigo, precio, tipo);
		
		try {
			ArticuloEntity articuloCreado = articuloService.crearArticulo(articuloDTO);
			System.out.println("Articulo creado con ID: " + articuloCreado.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
