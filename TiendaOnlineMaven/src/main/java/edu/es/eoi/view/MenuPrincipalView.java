package edu.es.eoi.view;

import java.util.Scanner;
import edu.es.eoi.controller.MenuController;

public class MenuPrincipalView {

	public static void imprimirMenu() throws Exception {


		System.out.println("Bienvenido a mi tienda, seleccion opcion: ");
		System.out.println("0-Listar productos");
		System.out.println("1-Tramitar compra");
		System.out.println("2-Ver carrito");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();

		MenuController.gestionaOpcionMenu(opcion);


	}
}
