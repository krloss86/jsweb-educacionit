package clase5;

import java.util.Objects;

import clase5.queue.TIPO;

public class Cliente implements Comparable<Cliente>{

	TIPO tipoCliente;
	private String documento;
	
	public Cliente(TIPO newTipo, String documento) {
		this.tipoCliente = newTipo;
		this.documento = documento;
	}
	
	//resta: a - b
	// 0 -> sin iguales
	// < 0 -> b es mayor a
	// > 0 -> a es mayor b
	public int compareTo(Cliente clienteAComprar) {
		if(this.documento.equals(clienteAComprar.getDocumento()))
			return 0; 
		//return this.tipoCliente.getValue().compareTo(clienteAComprar.getTipoCliente().getValue());
		int a = this.tipoCliente.getValue();
		int b = clienteAComprar.getTipoCliente().getValue();
		return b - a;
	}
	
	public TIPO getTipoCliente() {
		return tipoCliente;
	}

	

	@Override
	public String toString() {
		return "Cliente [tipoCliente=" + tipoCliente + ", documento=" + documento + "]";
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Cliente other = (Cliente) obj;
		return this.documento.equals(other.getDocumento());
	}
	
	
}
