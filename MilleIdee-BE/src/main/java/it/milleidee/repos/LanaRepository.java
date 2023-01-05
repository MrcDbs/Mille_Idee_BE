package it.milleidee.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.milleidee.model.Lana;

@Repository
public interface LanaRepository extends JpaRepository<Lana,Integer>{

	List<Lana> findAll();
	
	List<Lana> findByGrammi(Integer grammi);
	
	List<Lana> findByComposizioneContains(String comp);
	
	List<Lana> findByComposizioneContainsAndComposizioneContains(String comp,String comp2);
}
