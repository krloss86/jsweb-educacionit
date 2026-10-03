package clase5;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import clase5.queue.TIPO;

public class CrearClientes {

	public static Collection<Cliente> crearCliente () {
		
		//select * from cliente c inner join TIPOS t on t.id = c.tipo
		//-->  
		
		Cliente c1 = new Cliente(TIPO.PLATA,"123");
		Cliente c2 = new Cliente(TIPO.ORO,"1234");
		Cliente c3 = new Cliente(TIPO.BLACK,"12345");
		
		Set<Cliente> clientes = new TreeSet<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		return clientes;
	}
}
