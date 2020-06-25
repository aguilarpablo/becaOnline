package edu.es.eoi.view;

import java.util.Scanner;
import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class ProductoView {
	
	public static void imprimirProducto(Producto producto) {
		
		System.out.println("Información del producto: " + producto.getNombre());
		System.out.println(producto);
		
		System.out.println("¿Quieres comprar el producto?");
		System.out.println("1-Sí.");
		System.out.println("2-No.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int opcion = scanner.nextInt();
		if (opcion == 1) {
			App.productoController.comprar(producto);
		} 
	}
	
	public static Producto introduceReferencia() {
		
		Producto producto = null;
		System.out.println("Introduce la referencia del producto: ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		try {
			producto = App.productoController.buscar(scanner.next());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return producto;
		
	}
}
