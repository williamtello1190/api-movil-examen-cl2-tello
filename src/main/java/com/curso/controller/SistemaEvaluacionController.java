package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.SistemaEvaluacion;
import com.curso.service.SistemaEvaluacionService;

@RestController
@RequestMapping("/api/rest/sistemaevaluacion/")
public class SistemaEvaluacionController {
	
	@Autowired
	private SistemaEvaluacionService service;
	
	@GetMapping
	public ResponseEntity<List<SistemaEvaluacion>> listar(){
		return ResponseEntity.ok(service.listaSistemaEvaluacion());
	}

}
