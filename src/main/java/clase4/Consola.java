package clase4;

public abstract class Consola {

	private String nombre;
	private boolean esDigital;
	private boolean tieneLectora;
	
	//aca
	public Consola(String nombre, boolean esDigital, boolean tieneLectora) {
		this.nombre = nombre;
		this.esDigital = esDigital;
		this.tieneLectora = tieneLectora;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		//validaciones
		this.nombre = nombre;
	}

	/**
	 * @return the esDigital
	 */
	public boolean isEsDigital() {
		return esDigital;
	}

	/**
	 * @param esDigital the esDigital to set
	 */
	public void setEsDigital(boolean esDigital) {
		this.esDigital = esDigital;
	}

	/**
	 * @return the tieneLectora
	 */
	public boolean isTieneLectora() {
		return tieneLectora;
	}

	/**
	 * @param tieneLectora the tieneLectora to set
	 */
	public void setTieneLectora(boolean tieneLectora) {
		this.tieneLectora = tieneLectora;
	}
	
	
}
