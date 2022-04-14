package nttdata.bootcamp.microservicios.activo.personal.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nttdata.bootcamp.microservicios.activo.personal.documents.PersonalAsset;
import nttdata.bootcamp.microservicios.activo.personal.repository.PersonalAssetRepository;
import nttdata.bootcamp.microservicios.activo.personal.services.PersonalAssetService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonalAssetServiceImpl  implements PersonalAssetService  {
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalAssetServiceImpl.class);
	
	@Autowired
	PersonalAssetRepository repository;
	
	@Override
	public Mono<PersonalAsset> findById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Flux<PersonalAsset> findAlls() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public Mono<PersonalAsset> saves(PersonalAsset document) {
		// TODO Auto-generated method stub
		return repository.save(document);
	}

	@Override
	public Mono<Void>  delete(PersonalAsset document) {
		// TODO Auto-generated method stub
		return repository.delete(document);
				}

}
