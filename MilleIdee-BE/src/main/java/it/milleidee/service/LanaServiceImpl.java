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

	@Override
	public List<Lana> cercaPerGrammi(Integer grammi) {
//		List<Integer> grammiRange = new ArrayList<>();
//		grammiRange.add(Math.round(grammi));
		
		return this.lanaRepo.findByGrammi(grammi);
	}
	
	@Override
	public List<Lana> cercaPerComposizione(String composizione) {
		String param = "";
		if(composizione.contains(",")) {
			String[] comp = composizione.split(",");
//			for(String s:comp) {
//				param += s+" ";
//			}
			return this.lanaRepo.findByComposizioneContainsAndComposizioneContains(comp[0],comp[1]);
		}else {
			return this.lanaRepo.findByComposizioneContains(composizione);
		}
		
	}
	
}
