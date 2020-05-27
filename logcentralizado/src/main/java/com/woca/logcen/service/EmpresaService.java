package com.woca.logcen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woca.logcen.domain.Empresa;
import com.woca.logcen.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repo;
	
	public List<Empresa> findAll(){
		return repo.findAll();
	}

}
