package clase5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//Collection
		Set<Integer> edades = new HashSet<Integer>();
		Set<Integer> edades3 = new LinkedHashSet<Integer>();
		
		edades.add(10);
		edades.add(10);//no lo agrega
		edades.add(20);
		
		System.out.println(edades);
		
		edades3.add(10);
		edades3.add(10);//no lo agrega
		edades3.add(20);
		
		System.out.println(edades3);
				
		Set<String> edadesTree = new TreeSet<String>();
		edadesTree.add("A");
		edadesTree.add("a");
		edadesTree.add("c");
		
		/*
		Comparable<T>
		Integer,
		Float,
		Double,
		Booelan 
		String
		*/
		
		System.out.println(edadesTree);
	}
}
