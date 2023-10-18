package Preuniversitario.Arquitectura.Repositorys;

import Preuniversitario.Arquitectura.Models.Pagos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPagosRepository extends JpaRepository<Pagos,Integer> {
}
