package edu.es.eoi.entity;

import java.util.List;

public class Carrito {
	
	private List<Producto> productos;

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public void realizarComprar() {
		//llamare para procesar la compra
	}

	public Carrito(List<Producto> arrayList) {
		super();
		this.productos = arrayList;
	}
	
}
