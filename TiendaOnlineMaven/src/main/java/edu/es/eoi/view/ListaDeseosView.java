package edu.es.eoi.view;

import edu.es.eoi.App;
import edu.es.eoi.entity.Producto;

public class ListaDeseosView {
	
public static void imprimirListaDeseos() {
		
		for (Producto producto : App.deseos.getProductos()) {
			System.out.println(producto);
		}
		
	}

}
