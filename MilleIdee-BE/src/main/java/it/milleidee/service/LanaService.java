package it.milleidee.service;

import java.util.List;

import it.milleidee.model.Lana;

public interface LanaService {

	
	public List<Lana> getAllLana();
	
	public Lana salva(Lana lanaEntity); 
	
	public List<Lana> cercaPerGrammi(Integer grammi);
	
	public List<Lana> cercaPerComposizione(String composizione);
}
