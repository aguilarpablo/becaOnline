package edu.es.eoi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrito {
	
	private List<Producto> productos;

	public void realizarComprar() {
		//llamare para procesar la compra
	}

	public Carrito(List<Producto> arrayList) {
		super();
		this.productos = arrayList;
	}
	
}
