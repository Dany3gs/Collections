package Pag12Dos;

/*
Desarrolla un programa que inserte 1000 registros en un ArrayList y en un LinkedList.

Posteriormente, calcule el tiempo en que tarda cada una de las listas en insertar un valor en la posición 100;
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class PagDoceDos {
	public static void main(String[] args) {
		
		// Una forma visual en terminal es usando la clase System.nanoTime(), declarados antes y después del código
		// A medir desde --------------------------------
		long startTime1 = System.nanoTime();
		ArrayList listaArray = new ArrayList();

		// Rellenamos el ArrayList con 1000 elementos
		for (int i = 0; i < 1000; i++) {
			listaArray.add(i);
		}

		// Mostramos los primeros 100 elementos
		System.out.println("Los elementos son: " + listaArray.get(100));
		long endTime1 = System.nanoTime();
		// A medir hasta --------------------------------
		
		System.out.println("Tiempo de ejecución del ArrayList: " + (endTime1 - startTime1) + " nanosegundos");
		System.out.println("-------------------------------------");

		// A medir desde --------------------------------
		long startTime2 = System.nanoTime();

		// Creamos el LinkedList
		LinkedList listaLinkedList = new LinkedList();

		// Rellenamos el LinkedList con 1000 elementos
		for (int i = 0; i < 1000; i++) {
			listaLinkedList.add(i);
		}

		// Mostramos los primeros 100 elementos
		System.out.println("Los elementos son: " + listaLinkedList.get(100));

		// Finalizamos el nanoTime para que calcule hasta aquí el tiempo de ejection
		long endTime2 = System.nanoTime();
		// A medir hasta --------------------------------
		
		System.out.println("Tiempo de ejecución del LinkedList: " + (endTime2 - startTime2) + " nanosegundos");
		System.out.println("-------------------------------------");
		System.out.println("La diferencia de tiempo de ejecución es de: " + ((endTime1 - startTime1) - (endTime2 - startTime2)) + " nanosegundos");
		System.out.println("Indicando que el LinkedList es más lento que el ArrayList en esta operación.");
	}
}
