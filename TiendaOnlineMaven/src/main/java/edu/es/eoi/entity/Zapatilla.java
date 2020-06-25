package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Zapatilla extends ProductoDeportivo {

	private String talla;

	public Zapatilla(String nombre, String referencia, double precio, String descripcion, int stock, String marca,
			String talla) {
		super(nombre, referencia, precio, descripcion, stock, marca);
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Zapatilla [Talla=" + getTalla() + ", Marca=" + getMarca()
				+ ", Nombre=" + getNombre() + ", Referencia=" + getReferencia() + ", Precio="
				+ getPrecio() + ", Descripcion=" + getDescripcion() + ", Stock=" + getStock()
				+ ", Detalle=" + getDetalle() +  "]";
	}
	
	
	
}
