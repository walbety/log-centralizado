package com.woca.logcen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.woca.logcen.domain.Fluxo;

@Repository
public interface FluxoRepository extends MongoRepository<Fluxo, String>{

}