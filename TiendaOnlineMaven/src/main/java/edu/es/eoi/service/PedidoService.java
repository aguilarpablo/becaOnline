package edu.es.eoi.service;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import edu.es.eoi.entity.Carrito;
import edu.es.eoi.entity.Pedido;
import edu.es.eoi.repository.PedidoRepository;

public class PedidoService {

	private Map<String, Pedido> pedidos;
	private Carrito carrito;
	private PedidoRepository repository;

	public PedidoService(Map<String, Pedido> pedidos, Carrito carrito) {
		super();
		this.carrito = carrito;
		this.repository = new PedidoRepository(pedidos);
	}

	public Pedido consultarPedido(String numPedido) {
		return repository.read(numPedido);
	}

	public void generarFactura(Carrito carrito) {
		if (carrito.getProductos().isEmpty()) {
			System.out.println("No tiene nada en el carrito.");
		} else {
			Pedido pedido = new Pedido();
			//fecha pedido
			Date fecha = new Date();
			pedido.setFechaCompra(fecha);
			// generamos número de pedido
			char[] chars = "0123456789".toCharArray();
			int charsLength = chars.length;
			StringBuffer buffer = new StringBuffer();
			Random random = new Random();
			// Bucle para elegir una cadena de 8 caracteres al azar
			for (int i = 0; i < 8; i++) {
				// Añadimos al buffer un caracter al azar del array
				buffer.append(chars[random.nextInt(charsLength)]);
			}
			pedido.setNumeroPedido(buffer.toString());
			pedido.setProductos(carrito.getProductos());
			repository.create(pedido);
			System.out.println("Este es su número de pedido: " + pedido.getNumeroPedido());
		}
	}
	
	public void eliminarCarrito(Carrito carrito) {
		carrito.getProductos().clear();
	}

	public Map<String, Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Map<String, Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

}
