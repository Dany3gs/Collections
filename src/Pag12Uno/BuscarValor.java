package Pag12Uno;

import java.util.LinkedList;
import java.util.Scanner;

public class BuscarValor {
	private LinkedList<Integer> valor;
	
	
	public BuscarValor() {
		valor = new LinkedList<>();
	}
	
	public LinkedList<Integer> getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = this.valor;
	}
	
	public void rellenarValor() {
		for (int i = 20; i >= 1; i--) {
			valor.add(i);
		}
	}
	
	public void buscarValor(int numero) {
		int numeroIndicado = numero;
		Scanner scanner = new Scanner(System.in);
		boolean encontrado = false;
		
		while (!encontrado) {
			if (valor.contains(numero)) {
				System.out.println("El número indicado es: " + numero);
				System.out.println("Los números anterior y posterior son -> " + (numero - 1) + " y " + (numero + 1));
				encontrado = true;
			} else {
				System.out.println("El número no es válido, inténtelo de nuevo");
				System.out.print("Introduce un nuevo número: ");
				numero = scanner.nextInt();
			}
		}
	}
}

