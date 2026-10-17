package clase7.domain;

public class ArticuloEntity {
	//cmpleta con los atributos de la tabla articulos
	private Integer id;
	private String titulo;
	private String codigo;
	private Double precio;
	private Integer tipo;
	public ArticuloEntity(String titulo, String codigo, Double precio, Integer tipo) {
		super();
		this.titulo = titulo;
		this.codigo = codigo;
		this.precio = precio;
		this.tipo = tipo;
	}
	public ArticuloEntity(Integer id, String titulo, String codigo, Double precio, Integer tipo) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.codigo = codigo;
		this.precio = precio;
		this.tipo = tipo;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @return the tipo
	 */
	public Integer getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
}
