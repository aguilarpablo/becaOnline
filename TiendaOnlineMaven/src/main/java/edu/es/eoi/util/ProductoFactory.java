package edu.es.eoi.util;

import edu.es.eoi.entity.Producto;
import edu.es.eoi.entity.Zapatilla;

public class ProductoFactory {
	
	public static Producto getProducto(Producto producto) {
		
		if (producto instanceof Zapatilla) {
			return ((Zapatilla)producto);
		}
		
		return producto;
		
	}

}
