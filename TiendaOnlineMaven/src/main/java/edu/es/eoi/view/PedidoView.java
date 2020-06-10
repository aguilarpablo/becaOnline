package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.entity.Pedido;

public class PedidoView {
	
	public static Pedido introduceNumeroPedido() {

		System.out.println("Introduce el número del pedido: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		return App.pedidoController.buscar(scanner.next());

	}

	public static void imprimirPedido(Pedido pedido) {
		
		System.out.println("Información del pedido " + pedido.getNumeroPedido());
		System.out.println(pedido);
		
	}
}
