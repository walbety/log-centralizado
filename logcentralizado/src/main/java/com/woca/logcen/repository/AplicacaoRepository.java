package com.woca.logcen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.woca.logcen.domain.Aplicacao;

@Repository
public interface AplicacaoRepository extends MongoRepository<Aplicacao, String>{

}