package nttdata.bootcamp.microservicios.activo.personal.services;

import nttdata.bootcamp.microservicios.activo.personal.documents.PersonalAsset;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalAssetService {
public Mono<PersonalAsset> findById(String id);

public Flux<PersonalAsset> findAlls();



public Mono<PersonalAsset> saves(PersonalAsset document);

public Mono<Void> delete(PersonalAsset document);
}
