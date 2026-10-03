package clase5;

public enum ENTEROS_PERMITIDOS {
	
	UNO(1), 
	DOS(2),
	TRES(3),
	CUATRO(4)
	;
	
	private int value;

	ENTEROS_PERMITIDOS(int i) {
		this.value = i;
	}	
	public int getValue() {
		return this.value;
	}
}
