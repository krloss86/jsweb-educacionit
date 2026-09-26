package clase4;

public class PlayStation extends Consola implements Jugable{

	private String version;//1/2/3/4/5
	
	@Override
	public void jugar() {
		System.out.println("Juando Play");		
	}

	public PlayStation(String nombre, boolean esDigital, boolean tieneLectora, String version) {
		super(nombre, esDigital, tieneLectora);
		this.version = version;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	
}
