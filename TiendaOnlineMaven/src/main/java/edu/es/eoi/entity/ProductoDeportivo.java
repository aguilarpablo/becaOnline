package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDeportivo extends Producto {

	private String marca;

	public ProductoDeportivo(String nombre, String referencia, double precio, String descripcion, int stock,
			String marca) {
		super(nombre, referencia, precio, descripcion, stock);
		this.marca = marca;
	}
	
	
}
