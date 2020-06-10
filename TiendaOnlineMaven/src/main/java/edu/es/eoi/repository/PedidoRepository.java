package edu.es.eoi.repository;

import java.util.Map;

import edu.es.eoi.entity.Pedido;

public class PedidoRepository {
	
	private Map<String, Pedido> pedidos;

	public PedidoRepository(Map<String, Pedido> pedidos) {
		super();
		this.pedidos = pedidos;
	}

	public void create(Pedido pedido) {
		pedidos.put(pedido.getNumeroPedido(), pedido);
	}

	public Pedido read(String numPedido) {
		return pedidos.get(numPedido);
	}

	public void update(Pedido pedido) {
		pedidos.put(pedido.getNumeroPedido(), pedido);
	}

	public void delete(String numPedido) {
		pedidos.remove(numPedido);
	}

}
