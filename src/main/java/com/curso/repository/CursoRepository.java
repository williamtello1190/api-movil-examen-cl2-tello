package com.curso.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso,Integer> {
	
}
