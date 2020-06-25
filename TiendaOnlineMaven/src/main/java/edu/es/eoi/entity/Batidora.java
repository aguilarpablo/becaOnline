package edu.es.eoi.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Batidora extends ProductoElectronico {

	private int revoluciones;

	public Batidora(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, int revoluciones) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.revoluciones = revoluciones;
	}

	@Override
	public String toString() {
		return "Batidora [Revoluciones=" + getRevoluciones() + ", Modelo="
				+ getModelo() + ", Battery=" + getBattery() + ", Detalle=" + getDetalle() + ", Nombre="
				+ getNombre() + ", Referencia=" + getReferencia() + ", Precio=" + getPrecio()
				+ ", Descripcion=" + getDescripcion() + ", Stock=" + getStock() + "]";
	}

	
	
	
	
}
