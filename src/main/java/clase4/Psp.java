package clase4;

public class Psp extends ConsolaPortatil{

	public Psp(String nombre, boolean esDigital, boolean tieneLectora, float peso) {
		super(nombre, esDigital, tieneLectora, peso);
	}
 
	@Override
	public void jugar() {
		System.out.println("Juando Psp");
	}
}
