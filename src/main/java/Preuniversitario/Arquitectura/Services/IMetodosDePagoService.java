package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.MetodosDePago;

import java.util.List;

public interface IMetodosDePagoService<T>{

    List<MetodosDePago> findAll();

    MetodosDePago create(MetodosDePago metodosDePago);
}
