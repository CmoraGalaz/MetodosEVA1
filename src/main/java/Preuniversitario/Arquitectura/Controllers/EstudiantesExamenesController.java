package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.EstudiantesExamenes;
import Preuniversitario.Arquitectura.Models.Examenes;
import Preuniversitario.Arquitectura.Services.EstudiantesExamenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estudiantesexamenes")
public class EstudiantesExamenesController {

    @Autowired
    private EstudiantesExamenesService examenesService;


    @GetMapping
    public ResponseEntity<List<EstudiantesExamenes>> findAll() {
        List<EstudiantesExamenes> estudiantesExamenes = examenesService.findAll();
        return new ResponseEntity<>(estudiantesExamenes, HttpStatus.OK);
    }
}
