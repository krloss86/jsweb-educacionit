package clase5.queue;

public enum TIPO {

	PLATA(1),
	ORO(2),
	BLACK(3)
	;
	private Integer value;
	
	private TIPO(Integer newValue) {
		this.value = newValue;
	}
	public Integer getValue() {
		return value;
	}
}
