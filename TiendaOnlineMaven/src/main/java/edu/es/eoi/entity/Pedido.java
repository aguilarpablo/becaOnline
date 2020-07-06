package edu.es.eoi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pedidos")
@NoArgsConstructor
public class Pedido {
	
	@Id
	private String referencia;	
	@Column(name = "fecha")
	private Date fecha;
    @ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persona")
	private Persona persona;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(schema = "tienda", name = "rel_productos_pedidos", joinColumns = 
    	@JoinColumn(name = "ref_pedido"), inverseJoinColumns 
    	= @JoinColumn(name = "ref_producto"))
    private List<Producto> productos;
	
}
