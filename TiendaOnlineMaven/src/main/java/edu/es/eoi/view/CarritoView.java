package edu.es.eoi.view;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class CarritoView {

	public static void imprimirCarrito() {
		if (App.carrito.getProductos().isEmpty()) {
			System.out.println("No tienes nada en el carrito.");
		} else {
			for (Producto producto : App.carrito.getProductos()) {
				System.out.println(producto);
			}
		}
	}

}
