package com.woca.logcen.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.woca.logcen.domain.Empresa;

@Repository
public interface EmpresaRepository extends MongoRepository<Empresa, String>{

}