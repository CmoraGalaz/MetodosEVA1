package Preuniversitario.Arquitectura;

import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Repositorys.IEstudiantesRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(
        replace = AutoConfigureTestDatabase.Replace.NONE
)
public class EstudiantesRepositoryTest {
    @Autowired
    private IEstudiantesRepository iEstudiantesRepository;

    private EstudiantesRepositoryTest() {

    }


    @Test
    void guardarEstudiantes() {
        Estudiantes estudiantes = new Estudiantes();
        estudiantes.setRut(193418058);
        estudiantes.setApellidos("Mora Galaz");
        estudiantes.setNombres("Carlos Esteban");
        estudiantes.setTipoColegio("Privado");
        estudiantes.setFechaNacimiento("19/03/1996");
        estudiantes.setNombreColegio("San Sebastian");
        estudiantes.setEgreso(2017);
        iEstudiantesRepository.save(estudiantes);

    }


}






