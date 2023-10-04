package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Aranceles;
import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Services.ArancelesService;
import Preuniversitario.Arquitectura.Services.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aranceles")
public class ArancelesController {
    @Autowired
    private ArancelesService arancelesService;

    @GetMapping
    public ResponseEntity<List<Aranceles>> findAll(){
        List<Aranceles>aranceles = arancelesService.findAll();
        return new ResponseEntity<>(aranceles, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Aranceles> create(@RequestBody Aranceles aranceles){
        return new ResponseEntity<>(arancelesService.create(aranceles),HttpStatus.CREATED);
    }
}
