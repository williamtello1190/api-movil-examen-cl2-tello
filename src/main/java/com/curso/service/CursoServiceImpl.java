package com.curso.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.curso.entity.Curso;
import com.curso.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	@Override
	public Curso insertarCurso(Curso obj) {
		return repository.save(obj);
	}

	@Override
	public List<Curso> listaCurso() {
		return repository.findAll();
	}
	
	

}
