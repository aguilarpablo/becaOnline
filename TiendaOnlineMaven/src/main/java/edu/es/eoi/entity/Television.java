package edu.es.eoi.entity;

public class Television extends ProductoElectronico {
	
	private String definicion;
	private String marca;
	
	public Television(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, String definicion, String marca) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.definicion = definicion;
		this.marca = marca;
	}

	public String getDefinicion() {
		return definicion;
	}

	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Television [Definicion=" + getDefinicion() + ", Marca=" + getMarca() + ", Modelo=" + getModelo() + ", Battery=" + getBattery()
				+ ", Detalle=" + getDetalle() + ", Nombre=" + getNombre() + ", Referencia="
				+ getReferencia() + ", Precio=" + getPrecio() + ", Descripcion=" + getDescripcion()
				+ ", Stock=" + getStock() +  "]";
	}

}
