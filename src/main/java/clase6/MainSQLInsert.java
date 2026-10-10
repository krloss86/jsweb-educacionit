package clase6;

public class MainSQLInsert {

	public static void main(String[] args) {
		
		ArticuloService articuloService = new ArticuloService(new DbManager());
		
		ArticuloDTO articuloDTO = new ArticuloDTO("Articulo 1", "A001", 100.0, 1);
		
		try {
			ArticuloEntity articuloCreado = articuloService.crearArticulo(articuloDTO);
			System.out.println("Articulo creado con ID: " + articuloCreado.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
