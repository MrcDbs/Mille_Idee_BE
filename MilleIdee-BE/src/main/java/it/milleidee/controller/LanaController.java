package it.milleidee.controller;

import org.springframework.web.bind.annotation.*;

import it.milleidee.model.Lana;
import it.milleidee.service.LanaServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/lanaController")
@CrossOrigin(value="http://localhost:4200/")
public class LanaController {
	
	@Autowired
	private LanaServiceImpl lanaService;
	
	@GetMapping(value="/getAllLana",produces="application/json")
	//@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Lana>> getLanaList() {
		return new ResponseEntity<>(this.lanaService.getAllLana(),HttpStatus.OK);
	}
	@GetMapping(value="/getLanaById/{id}",produces="application/json")
	@ResponseStatus(HttpStatus.OK)
	public void getLanaById(@PathVariable Long id) {
		
	}
	
	@PostMapping(value="/saveLana",produces="application/json", consumes="application/json")
	@ResponseStatus(HttpStatus.OK)
	public Lana saveLana(@RequestBody Lana lanaEntity) {
		System.out.println("ENTRA NEL POST");
		return this.lanaService.salva(lanaEntity);
	}
	
	
	
}
