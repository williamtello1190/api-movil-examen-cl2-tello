package com.curso.service;

import java.util.List;

import com.curso.entity.SistemaEvaluacion;
import com.curso.repository.SistemaEvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SistemaEvaluacionServiceImpl implements SistemaEvaluacionService {

	@Autowired
	private SistemaEvaluacionRepository repository;
	
	@Override
	public List<SistemaEvaluacion> listaSistemaEvaluacion() {
		
		return repository.findAll();
	}

}
