package edu.es.eoi.entity;

import java.util.Date;
import java.util.List;

public class Pedido {
	
	private String numeroPedido;
	private Persona comprador;
	private List<Producto> productos;
	private Date fechaCompra;
	
	public String getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date calendar) {
		this.fechaCompra = calendar;
	}
	public Persona getComprador() {
		return comprador;
	}
	public void setComprador(Persona comprador) {
		this.comprador = comprador;
	}
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", comprador=" + comprador + ", productos=" + productos
				+ ", fechaCompra=" + fechaCompra + "]";
	}
	
	
	
}
