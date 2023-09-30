package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.EstudiantesExamenes;
import Preuniversitario.Arquitectura.Repositorys.IEstudianteExamenesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudiantesExamenesService implements IEstudiantesExamenesService<EstudiantesExamenes>{
    @Autowired
    private IEstudianteExamenesRepository iEstudianteExamenesRepository;


    @Override
    public List<EstudiantesExamenes> findAll() {
        return iEstudianteExamenesRepository.findAll();
    }

    @Override
    public EstudiantesExamenes create(EstudiantesExamenes estudiantesExamenes) {
        return iEstudianteExamenesRepository.save(estudiantesExamenes);
    }
}
