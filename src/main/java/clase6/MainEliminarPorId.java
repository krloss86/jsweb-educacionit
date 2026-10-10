package clase6;

import java.util.Scanner;

public class MainEliminarPorId {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el ID del articulo a eliminar: ");
		
		Integer id = scanner.nextInt();
		
		ArticuloService articuloService = new ArticuloService(new DbManager());
		
		articuloService.eliminarPorId(id);		
		
		scanner.close();
	}

}
