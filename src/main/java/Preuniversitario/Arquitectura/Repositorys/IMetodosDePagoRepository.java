package Preuniversitario.Arquitectura.Repositorys;

import Preuniversitario.Arquitectura.Models.MetodosDePago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMetodosDePagoRepository extends JpaRepository<MetodosDePago, Integer> {
}
