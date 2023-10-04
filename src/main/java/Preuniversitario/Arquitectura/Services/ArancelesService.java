package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Aranceles;
import Preuniversitario.Arquitectura.Repositorys.IArancelesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArancelesService implements IArancelesService<Aranceles> {
    @Autowired
    private IArancelesRepository iArancelesRepository;
    @Override
    public List<Aranceles> findAll() {
        return iArancelesRepository.findAll();
    }

    @Override
    public Aranceles create(Aranceles aranceles) {
        return iArancelesRepository.save(aranceles);
    }
}
