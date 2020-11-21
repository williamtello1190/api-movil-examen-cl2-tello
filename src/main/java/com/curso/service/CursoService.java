package com.curso.service;
import java.util.List;

import com.curso.entity.Curso;

public interface CursoService {
 public abstract Curso insertarCurso(Curso obj);
 public abstract List<Curso> listaCurso();
}
