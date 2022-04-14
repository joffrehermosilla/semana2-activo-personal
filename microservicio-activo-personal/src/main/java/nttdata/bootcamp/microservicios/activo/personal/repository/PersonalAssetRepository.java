package nttdata.bootcamp.microservicios.activo.personal.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import nttdata.bootcamp.microservicios.activo.personal.documents.PersonalAsset;

@Repository
public interface PersonalAssetRepository extends ReactiveMongoRepository<PersonalAsset, String>{
	

}
