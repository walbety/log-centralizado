package com.woca.logcen.dto;

import java.io.Serializable;

import com.woca.logcen.domain.Empresa;

public class EmpresaDTO implements Serializable {

	private static final long serialVersionUID = -2756813078612604687L;
	
	private String id;
	private String nome;
	
	public EmpresaDTO(Empresa empresa) {
		this.id = empresa.getId();
		this.nome = empresa.getNome();
	}
	
	public EmpresaDTO() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
