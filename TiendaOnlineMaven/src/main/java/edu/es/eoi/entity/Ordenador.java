package edu.es.eoi.entity;

public class Ordenador extends ProductoElectronico {

	private String sistemaOperativo;

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Ordenador(String nombre, String referencia, double precio, String descripcion, int stock, String modelo,
			double battery, String sistemaOperativo) {
		super(nombre, referencia, precio, descripcion, stock, modelo, battery);
		this.sistemaOperativo = sistemaOperativo;
	}

	@Override
	public String toString() {
		return "Ordenador [SistemaOperativo=" + getSistemaOperativo()
				+ ", Modelo=" + getModelo() + ", getBattery()=" + getBattery() + ", Detalle=" + getDetalle()
				+ ", Nombre=" + getNombre() + ", Referencia=" + getReferencia() + ", Precio="
				+ getPrecio() + ", Descripcion=" + getDescripcion() + ", Stock=" + getStock()
				+ "]";
	}
	
	
}
