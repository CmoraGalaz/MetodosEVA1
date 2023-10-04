package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Services.EstudiantesService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class EstudianteController {
    @Autowired
    private EstudiantesService estudiantesService;


    @GetMapping("/Estudiantes")
    public String mostrar (Model model){
        ArrayList<Estudiantes>estudiantes = (ArrayList<Estudiantes>) estudiantesService.findAll();
        model.addAttribute("estudiantes",estudiantes);
        return "ListarEstudiantes";

    }
}
