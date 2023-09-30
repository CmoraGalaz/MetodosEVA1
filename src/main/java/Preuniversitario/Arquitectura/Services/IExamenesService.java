package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Examenes;

import java.util.List;

public interface IExamenesService<T> {
    List<Examenes>findAll();

    Examenes create(Examenes examenes);
}
