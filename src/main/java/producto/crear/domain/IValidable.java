package producto.crear.domain;

public interface IValidable<T> {

	public ResultadoValidacion validate(T request);
}
