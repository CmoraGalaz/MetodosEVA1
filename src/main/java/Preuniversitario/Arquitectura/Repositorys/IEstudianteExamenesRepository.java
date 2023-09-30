package Preuniversitario.Arquitectura.Repositorys;

import Preuniversitario.Arquitectura.Models.EstudiantesExamenes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteExamenesRepository extends JpaRepository<EstudiantesExamenes,Integer> {
}
