package exceptions;

public class PasarelPagosv2 {

	public static void main(String[] args) {
		
		try(PasarelaPagos pasarela = new PasarelaPagos()) {
			 pasarela.pagar();
		}catch(Exception ace) {
			System.out.println(ace.getMessage());
		}
		
	}
}
