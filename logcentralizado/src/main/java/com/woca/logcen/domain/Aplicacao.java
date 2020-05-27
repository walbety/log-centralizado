package com.woca.logcen.domain;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "aplicacao")
public class Aplicacao implements Serializable {

		private static final long serialVersionUID = 4215740747151460901L;

		@Id
		private String id;
		private String nome;
		private Empresa empresa;
		private String descricao;
		private List<Fluxo> fluxos;
}