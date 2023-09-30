package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.EstudiantesExamenes;

import java.util.List;

public interface IEstudiantesExamenesService<T> {

    List<EstudiantesExamenes>findAll();

    EstudiantesExamenes create(EstudiantesExamenes estudiantesExamenes);
}
