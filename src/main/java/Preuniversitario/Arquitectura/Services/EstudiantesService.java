package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Repositorys.IEstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudiantesService implements IEstudiantesService<Estudiantes> {
    @Autowired
    private IEstudiantesRepository iEstudiantesRepository;
    @Override
    public List<Estudiantes> findAll() {
        return iEstudiantesRepository.findAll();
    }

    @Override
    public Estudiantes create(Estudiantes estudiante) {
        return iEstudiantesRepository.save(estudiante);
    }
}
