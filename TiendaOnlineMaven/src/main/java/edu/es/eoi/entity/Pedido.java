package edu.es.eoi.entity;

import java.util.Date;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pedido {
	
	private String numeroPedido;
	private Persona comprador;
	private List<Producto> productos;
	private Date fechaCompra;
	
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", comprador=" + comprador + ", productos=" + productos
				+ ", fechaCompra=" + fechaCompra + "]";
	}
	
	
	
}
