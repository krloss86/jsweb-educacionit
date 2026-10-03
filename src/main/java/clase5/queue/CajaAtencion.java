package clase5.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import clase5.Cliente;

public class CajaAtencion {

	public static void main(String[] args) {
		//atender a los clietnes 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ing Doc.");
		String documento = teclado.nextLine();
		System.out.println("Tipo Cliente");
		String tipoCliente = teclado.nextLine();//existan en nuestro ENUM
		
		Queue<Cliente> clientes = new PriorityQueue<Cliente>();
		while(!documento.equals("0") ) {
			Cliente c = new Cliente(TIPO.valueOf(tipoCliente), documento);
			clientes.offer(c);
						
			System.out.println("Ing Doc.");
			documento = teclado.nextLine();
			System.out.println("Tipo Cliente");
			tipoCliente = teclado.nextLine();//existan en nuestro ENUM
		}
		
		//System.out.println(clientes);
		System.out.println("llamando a los clientes en cola");
		Iterator<Cliente> itClientes = clientes.iterator();
		System.out.println("Todos los clietnes en la cola:" + clientes);
		while(itClientes.hasNext()) {
			Cliente c = itClientes.next();
			System.out.println("Atendienod a:" + c);
			
			itClientes.remove();
			System.out.println("Quedan" + clientes);
		}
		
		teclado.close();
	}
}
