package clase4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;//ver en la clase de Collections

public class ReposoInterfacesMain {

	public static void main(String[] args) {
		
		List<Consola> listado = new ArrayList<Consola>(); //[] 
		
		//crear consola
		//Consola m = new Consola();// no, porque es abstracta
		ConsolaPortatil cp = new ConsolaPortatil(null, false, false, 0);
		
		ConsolaPortatil psp = new Psp(null, false, false, 0); 
		
		ConsolaPortatil swith = new Switch(null, false, false, 0);
		
		PlayStation ps1 = new PlayStation(null, false, false, null);
		Xbox xbox = new Xbox(null, false, false);
		
		Consola cps1 = new PlayStation(null, false, false, null);
		Consola cxbox = new Xbox(null, false, false);
		
		//Interface i = new ClaseQueImplementaInterface();
		Jugable j1 = new ConsolaPortatil(null, false, false, 0);
		Jugable j2 = new PlayStation(null, false, false, null);
		Jugable j3 = new Xbox(null, false, false);
		
		//casteo
		listado.add(cp);
		listado.add(psp);
		listado.add(swith);
		listado.add(ps1);
		listado.add(xbox);
		listado.add((Consola)j1);//parece que si j<=11|8?
		
		for (Consola consola : listado) {
			//System.out.println(consola.getClass().getSimpleName());
			Jugable jugableDentroDeConsola = (Jugable)consola;
			jugableDentroDeConsola.jugar();
		}
	}

}
