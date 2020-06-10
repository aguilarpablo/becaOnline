package edu.es.eoi.view;

import java.util.Map;

import edu.es.eoi.entity.Producto;

public class ListadoProductosView {
	
	public static void imprimirProductos(Map<String, Producto> almacen) {
		
		System.out.println("Estos son todos mis productos: ");
		
		for (Producto producto : almacen.values()) {
			System.out.println(producto);
		}
		
	}

}
