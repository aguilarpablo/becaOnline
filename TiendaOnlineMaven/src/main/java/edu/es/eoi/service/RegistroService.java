package edu.es.eoi.service;

import java.util.List;

import edu.es.eoi.entity.Persona;
import edu.es.eoi.repository.PersonaRepository;

public class RegistroService {
	
	private List<Persona> usuarios;
	private PersonaRepository repository;
	
	public RegistroService(List<Persona> usuarios) {
		super();
		this.repository = new PersonaRepository(usuarios);
	}

	public void altaUsuario(Persona persona) {
		usuarios.add(persona);		
	}
	
	public void bajaUsuario(Persona persona) {
		usuarios.remove(persona);
	}

	public List<Persona> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Persona> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
