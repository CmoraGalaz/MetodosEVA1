package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Estudiantes;

import java.util.List;

public interface IEstudiantesService<T> {
    List<Estudiantes> findAll();

    Estudiantes create(Estudiantes estudiante);

    Estudiantes update(Estudiantes model);

    void delete(Integer id);

}
