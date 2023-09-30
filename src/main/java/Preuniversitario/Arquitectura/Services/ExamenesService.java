package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Examenes;
import Preuniversitario.Arquitectura.Repositorys.IExamenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamenesService implements IExamenesService<Examenes>{
    @Autowired
    private IExamenesRepository iExamenesRepository;
    @Override
    public List<Examenes> findAll() {
        return iExamenesRepository.findAll();
    }

    @Override
    public Examenes create(Examenes examenes) {
        return iExamenesRepository.save(examenes);
    }
}
