package edu.es.eoi.service;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.ListaDeseos;
import edu.es.eoi.entity.Producto;
import edu.es.eoi.repository.ProductoRepository;

public class ProductoService {
	
	private Carrito carrito;
	private ListaDeseos deseos;
	private ProductoRepository repository;


	public ProductoService(Carrito carrito, ListaDeseos deseos) {
		super();
		this.carrito = carrito;
		this.deseos = deseos;
		this.repository = new ProductoRepository();
	}
	
	public void comprar(Producto producto) {
		if (producto.getStock() > 0) {
			addToCarrito(producto);
			producto.setStock(producto.getStock() - 1);
		} else {
			addToListaDeseos(producto);
		}
	}
	
	public Producto buscar(String referencia) throws Exception {
		return repository.read(referencia);
	}
	
	public void comparar(String referencia1, String referencia2) throws Exception {
		
		Producto producto1 = repository.read(referencia1);
		Producto producto2 = repository.read(referencia2);
		
		//lógica comparación
		System.out.println("***************PRODUCTO " + producto1.getNombre() + "********************");
		System.out.println(producto1);
		System.out.println("***************PRODUCTO " + producto2.getNombre() + "********************");
		System.out.println(producto2);
	}
	
	public void addToCarrito(Producto producto) {
		carrito.getProductos().add(producto);
	}
	
	public void addToListaDeseos(Producto producto) {
		deseos.getProductos().add(producto);
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public ListaDeseos getDeseos() {
		return deseos;
	}

	public void setDeseos(ListaDeseos deseos) {
		this.deseos = deseos;
	}

	public ProductoRepository getRepository() {
		return repository;
	}

	public void setRepository(ProductoRepository repository) {
		this.repository = repository;
	}
	
	

	
}
