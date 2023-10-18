package Preuniversitario.Arquitectura.Services;


import Preuniversitario.Arquitectura.Models.Pagos;

import java.util.List;

public interface IPagosService<T> {
    List<Pagos> findAll();

    Pagos create(Pagos pagos);


}
