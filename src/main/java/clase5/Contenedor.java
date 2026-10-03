package clase5;

//genics -> un tipado sin tipo especifico
//el T se define cuando creo el objeto de la clase
public class Contenedor <T> {

	private T value;
	
	public Contenedor(T value) {
		this.value = value;
	}	
	
	public T getValue() {
		return this.value;
	}
	
	public void setValue(T newValue) {
		this.value = newValue;
	}
}
