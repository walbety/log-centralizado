package com.woca.logcen.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.woca.logcen.domain.Empresa;
import com.woca.logcen.dto.EmpresaDTO;
import com.woca.logcen.service.EmpresaService;



@RestController
@RequestMapping(value = "/Empresa")
public class EmpresaResource {

	@Autowired
	private EmpresaService empresaService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<EmpresaDTO>> findAll(){

		List<Empresa> lista = empresaService.findAll();
		List<EmpresaDTO> listaDto = lista.stream()
				.map(a -> new EmpresaDTO(a))
				.collect(Collectors.toList());
		return ResponseEntity.ok().body(listaDto);
	}
}
