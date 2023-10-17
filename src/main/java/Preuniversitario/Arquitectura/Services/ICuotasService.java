package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Cuotas;


import java.util.List;

public interface ICuotasService <T>{
    List<Cuotas> findAll();

    Cuotas create(Cuotas cuotas);
}
