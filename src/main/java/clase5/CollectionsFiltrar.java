package clase5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

import clase5.queue.TIPO;

public class CollectionsFiltrar {

	public static void main(String[] args) {
		Cliente c1 = new Cliente(TIPO.PLATA,"123");
		Cliente c2 = new Cliente(TIPO.ORO,"1234");
		Cliente c3 = new Cliente(TIPO.BLACK,"12345");
		Cliente c4 = new Cliente(TIPO.BLACK,"12345");
		
		Collection<Cliente> cls = new ArrayList<Cliente>();
		cls.add(c1);
		cls.add(c2);
		cls.add(c3);
		cls.add(c4);
		
		System.out.println(cls);
		
		//filtrar los duplicados
		cls = new TreeSet<Cliente>(cls);
		System.out.println(cls);
	}
}
