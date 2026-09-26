package clase4;

public class Switch extends ConsolaPortatil{

	public Switch(String nombre, boolean esDigital, boolean tieneLectora, float peso) {
		super(nombre, esDigital, tieneLectora, peso);
	}

	@Override
	public void jugar() {
		System.out.println("Juando Switch");
	}
}
