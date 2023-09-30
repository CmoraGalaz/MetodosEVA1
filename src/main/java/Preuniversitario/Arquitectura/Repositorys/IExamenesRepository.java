package Preuniversitario.Arquitectura.Repositorys;

import Preuniversitario.Arquitectura.Models.Examenes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExamenesRepository extends JpaRepository<Examenes,Integer> {
}
