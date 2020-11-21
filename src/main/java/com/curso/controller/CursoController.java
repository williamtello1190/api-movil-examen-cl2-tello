package com.curso.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.entity.Curso;
import com.curso.service.CursoService;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/rest/curso/")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@GetMapping
	public ResponseEntity<List<Curso>> listar(){
		return ResponseEntity.ok(service.listaCurso());
	}
	
	@PostMapping
	public ResponseEntity<Curso> inserta(@RequestBody Curso obj){
		return ResponseEntity.ok(service.insertarCurso(obj));
	}
	
}
