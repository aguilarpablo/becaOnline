package edu.es.eoi.view;

import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.es.eoi.controller.MenuController;

public class MenuPrincipalView {

	public static void imprimirMenu() throws FileNotFoundException {

		System.out.println("Bienvenido a mi tienda, selecciona opción: ");
		System.out.println("0-Listar productos");
		System.out.println("1-Carrito");
		System.out.println("2-Buscar articulos");
		System.out.println("3-Realizar pedido");
		System.out.println("4-Consultar pedidos");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		MenuController.gestionaOpcionMenu(opcion);

	}
}
