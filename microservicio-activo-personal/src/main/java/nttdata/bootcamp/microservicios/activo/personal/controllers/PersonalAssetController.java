package nttdata.bootcamp.microservicios.activo.personal.controllers;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nttdata.bootcamp.microservicios.activo.personal.documents.PersonalAsset;
import nttdata.bootcamp.microservicios.activo.personal.services.PersonalAssetService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonalAssetController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalAssetController.class);
	@Autowired
	private PersonalAssetService service;
	@GetMapping("/all")
	public Flux<PersonalAsset> searchAll() {
	Flux<PersonalAsset> per = service.findAlls(); LOGGER.info("PERSONAL ASSET registered: "
	+ per); return per; }



	@GetMapping("/id/{id}")
	public Mono<PersonalAsset> searchById(@PathVariable String id) {
	LOGGER.info("Personal Asset id: " + service.findById(id) + " con codigo: " + id);
	return service.findById(id);
	}

	@PostMapping("/create-personal-asset")
	public Mono<PersonalAsset> createPersonalAsset(@Valid @RequestBody PersonalAsset personalAsset) {
	LOGGER.info("PERSONAL ASSET create: " + service.saves(personalAsset));
	return service.saves(personalAsset);
	}
	
	
}
