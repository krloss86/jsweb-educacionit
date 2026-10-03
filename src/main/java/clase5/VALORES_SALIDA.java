package clase5;

public enum VALORES_SALIDA {
	
	OK("a"),
	ERROR("ERROR"),
	REINTENTO("c"),
	VACIO("d")
	;
	
	private String value;
	
	//ALGO, ERRR123, BLA,BASDASDM, ASD
	VALORES_SALIDA(String codExt) {
		if(codExt.equals("31321") ) {
			this.value = "ERROR";
		}
		this.value = "d";
	}
}
