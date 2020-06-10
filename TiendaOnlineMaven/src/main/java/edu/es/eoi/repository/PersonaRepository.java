package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Persona;

public class PersonaRepository {
	
	private List<Persona> usuarios;
	
	
	
	public PersonaRepository(List<Persona> usuarios) {
		super();
		this.usuarios = usuarios;
	}

	public void create(Persona persona) {
		
		usuarios.add(persona);

	}

	public Persona read(String name) {
		Persona person = null;
		for (Persona persona : usuarios) {
			if (persona.getMail().equals(name)) {
				person = persona;
			}
		}
		return person;

	}

	public void update(Persona persona) {
		usuarios.set(usuarios.indexOf(persona), persona);
	}

	public void delete(String mail) {
		Persona person = null;
		for (Persona persona : usuarios) {
			if (persona.getMail().equals(mail)) {
				person = persona;
			}
		}
		usuarios.remove(person);
	}

}
