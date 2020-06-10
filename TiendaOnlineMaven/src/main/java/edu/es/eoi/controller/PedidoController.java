package edu.es.eoi.controller;

import java.util.Map;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.service.PedidoService;

public class PedidoController {
	
	private PedidoService service;
	
	public PedidoController(Map<String, Pedido> pedidos, Carrito carrito) {
		super();
		this.service = new PedidoService(pedidos, carrito);
	}
	
	public void comprar(Carrito carrito) {
		service.generarFactura(carrito);
	}
	
	public Pedido buscar(String numPedido) {
		return service.consultarPedido(numPedido);
	}
	
	public void eliminarCarrito(Carrito carrito) {
		service.eliminarCarrito(carrito);
	}

}
