package it.milleidee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.milleidee.model.Lana;
import it.milleidee.repos.LanaRepository;

@Service
public class LanaServiceImpl implements LanaService{
	
	@Autowired
	private LanaRepository lanaRepo;

	@Override
	public List<Lana> getAllLana() {
		
		return this.lanaRepo.findAll();
	}

	@Override
	public Lana salva(Lana lanaEntity) {
		
		return this.lanaRepo.save(lanaEntity);
	}
	
}
