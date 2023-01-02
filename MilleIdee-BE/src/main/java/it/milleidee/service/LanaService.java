package it.milleidee.service;

import java.util.List;

import it.milleidee.model.Lana;

public interface LanaService {

	
	public List<Lana> getAllLana();
	
	public Lana salva(Lana lanaEntity); 
}
