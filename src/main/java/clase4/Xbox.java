package clase4;

public class Xbox extends Consola implements Jugable {

	@Override
	public void jugar() {
		System.out.println("Juando Xbox");	
	}

	public Xbox(String nombre, boolean esDigital, boolean tieneLectora) {
		super(nombre, esDigital, tieneLectora);
	}

	
}
