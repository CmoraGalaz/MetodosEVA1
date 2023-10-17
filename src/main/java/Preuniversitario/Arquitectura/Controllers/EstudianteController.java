package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Services.EstudiantesService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class EstudianteController {
    @Autowired
    private EstudiantesService estudiantesService;


    @GetMapping("/estudiantes")
    public String mostrar (Model model){
        ArrayList<Estudiantes>estudiantes = (ArrayList<Estudiantes>) estudiantesService.findAll();
        model.addAttribute("estudiantes",estudiantes);
        return "ListarEstudiantes";

    }

    @GetMapping("/estudiante/nuevo")
    public String crearEstudianteFormulario(Model model){
        Estudiantes estudiante = new Estudiantes();
        model.addAttribute("estudiante",estudiante);
        return "AdministracionUsuarios";

    }

    @PostMapping("/estudiante")
    public String guardarEstudiante(@ModelAttribute("estudiante")Estudiantes estudiante){
        estudiantesService.create(estudiante);
        return "redirect:/estudiantes";

    }

}
