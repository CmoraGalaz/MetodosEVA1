package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Aranceles;

import java.util.List;

public interface IArancelesService <T>{

    List<Aranceles>findAll();

    Aranceles create(Aranceles aranceles);
}
