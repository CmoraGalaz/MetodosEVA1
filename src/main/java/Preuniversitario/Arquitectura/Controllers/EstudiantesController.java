package Preuniversitario.Arquitectura.Controllers;


import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Services.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/All")
public class EstudiantesController {

    @Autowired
    private EstudiantesService estudiantesService;

    @GetMapping
    public ResponseEntity<List<Estudiantes>> findAll(){
        List<Estudiantes>estudiantes = estudiantesService.findAll();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Estudiantes> create(@RequestBody Estudiantes estudiantes){
        return new ResponseEntity<>(estudiantesService.create(estudiantes),HttpStatus.CREATED);
    }
}
