package edu.es.eoi.view;

import java.util.Scanner;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class FacturaView {
	
	public static void imprimirFactura() {
		System.out.println("**********FACTURA**********");
		double precioFinal = 0;
		
		for (Producto producto : App.carrito.getProductos()) {
			System.out.println(producto.getNombre() + "     " + producto.getPrecio() + " €");
			precioFinal = precioFinal + producto.getPrecio();
		}
		System.out.println("**************************");
		System.out.println("Precio Total: " + precioFinal + " €");
		System.out.println("**************************");
		System.out.println("¿Quieres realizar la compra?");
		System.out.println("1-Sí.");
		System.out.println("2-No.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();
		if (opcion == 1) {
			//App.pedidoController.comprar(App.carrito);
			//App.pedidoController.eliminarCarrito(App.carrito);
		} 
	}

}
