package Pag12Uno;
/*
Crear un programa que registre 20 valores ordenados de mayor a menor en una lista con LinkedList.

Posteriormente utilizando la clase LinkedList cree un método que busque un valor en la lista y me
indique el valor anterior y posterior a dicho valor a buscar.
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BuscarValor valor = new BuscarValor();
		valor.rellenarValor();
		System.out.println(valor.getValor());
		
		System.out.println("Indique un número:");
		int num = sc.nextInt();
		
		valor.buscarValor(num);
		
	}
}
