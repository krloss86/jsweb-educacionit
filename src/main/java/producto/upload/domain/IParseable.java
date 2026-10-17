package producto.upload.domain;

public interface IParseable<T> {

	public T parse(String data);
}
