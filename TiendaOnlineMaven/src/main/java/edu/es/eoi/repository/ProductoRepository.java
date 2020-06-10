package edu.es.eoi.repository;

import java.util.Map;

import edu.es.eoi.entity.Producto;

public class ProductoRepository {

	private Map<String, Producto> almacen;
	
	public ProductoRepository(Map<String, Producto> almacen2) {
		super();
		this.almacen = almacen2;
	}

	// CRUD

	public void create(Producto producto) {
		almacen.put(producto.getReferencia(), producto);
	}

	public Producto read(String referencia) {
		
		return almacen.get(referencia);
	}

	public void update(Producto producto) {
		almacen.put(producto.getReferencia(), producto);
	}

	public void delete(String referencia) {
		almacen.remove(referencia);

	}

}
