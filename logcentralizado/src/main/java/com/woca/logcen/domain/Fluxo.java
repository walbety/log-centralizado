package com.woca.logcen.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "fluxo")
public class Fluxo implements Serializable {

	private static final long serialVersionUID = 4215740747151460901L;
	
	@Id
	private String id;
	private String idAplicacao;
	private String execucao;
	private Boolean fluxoOk;
}
