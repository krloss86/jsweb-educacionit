package clase7.domain;

//representa la estructura de datos que se recibe desde el cliente para crear un producto
//clase innmutable, solo tiene getters, no setters, no se puede modificar una vez creado
public class ProductoRequest {

	private String titulo;
	private String codigo;
	private Double precio;
	private Integer tipo;
	
	public ProductoRequest(String titulo, String codigo, Double precio, Integer tipo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.precio = precio;
		this.tipo = tipo;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @return the tipo
	 */
	public Integer getTipo() {
		return tipo;
	}
	
	
}
