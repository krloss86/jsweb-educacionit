package clase7.domain;

public interface IValidable<T> {

	public ResultadoValidacion validate(T request);
}
