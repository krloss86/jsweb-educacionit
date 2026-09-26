package clase4;

public class ConsolaPortatil extends Consola implements Jugable{

	private float peso;
	
	@Override
	public void jugar() {
		System.out.println("Juando Portatil");
	}

	public ConsolaPortatil(String nombre, boolean esDigital, boolean tieneLectora, float peso) {
		super(nombre, esDigital, tieneLectora);
		this.peso = peso;
	}

	/**
	 * @return the peso
	 */
	public float getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}

	
	
}
