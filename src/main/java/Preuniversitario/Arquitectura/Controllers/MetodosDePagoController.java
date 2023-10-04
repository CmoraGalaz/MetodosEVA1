package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Aranceles;
import Preuniversitario.Arquitectura.Models.MetodosDePago;
import Preuniversitario.Arquitectura.Services.ArancelesService;
import Preuniversitario.Arquitectura.Services.MetodosDePagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metodosdepago")
public class MetodosDePagoController {
    @Autowired
    private MetodosDePagoService metodosDePagoService;

    @GetMapping
    public ResponseEntity<List<MetodosDePago>> findAll(){
        List<MetodosDePago>metodosDePagos = metodosDePagoService.findAll();
        return new ResponseEntity<>(metodosDePagos, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<MetodosDePago> create(@RequestBody MetodosDePago metodosDePago){
        return new ResponseEntity<>(metodosDePagoService.create(metodosDePago),HttpStatus.CREATED);
    }
}
