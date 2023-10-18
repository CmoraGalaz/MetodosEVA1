package Preuniversitario.Arquitectura.Controllers;


import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Models.Examenes;
import Preuniversitario.Arquitectura.Services.ExamenesService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class ExamenesController {

    @Autowired
    private ExamenesService examenesService;

    @GetMapping("/examenes")
    public String mostrar (Model model){
        ArrayList<Examenes> examenes = (ArrayList<Examenes>) examenesService.findAll();
        model.addAttribute("examenes",examenes);
        return "ListarExamenes";

    }
}
