package Preuniversitario.Arquitectura.Controllers;


import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Models.Examenes;
import Preuniversitario.Arquitectura.Services.ExamenesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examenes")
public class ExamenesController {

    @Autowired
    private ExamenesService examenesService;

    @GetMapping
    public ResponseEntity<List<Examenes>> findAll() {
        List<Examenes> examenes = examenesService.findAll();
        return new ResponseEntity<>(examenes, HttpStatus.OK);
    }
}
