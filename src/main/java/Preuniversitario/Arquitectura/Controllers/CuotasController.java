package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Cuotas;
import Preuniversitario.Arquitectura.Models.DocumentarArancelMastricula;
import Preuniversitario.Arquitectura.Services.CuotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class CuotasController {

    @Autowired
    private CuotasService cuotasService;


    @GetMapping("/cuotas")
    public String mostrar (Model model){
        ArrayList<Cuotas> cuotas = (ArrayList<Cuotas>) cuotasService.findAll();
        model.addAttribute("cuotas",cuotas);
        return "ListarCuotas";

    }

    @GetMapping("/cuotas/ingreso")
    public String crearCuotaFormulario(Model model){
        Cuotas cuota = new Cuotas();
        model.addAttribute("cuota",cuota);
        return "AdministracionCuotas";

    }

    @PostMapping("/cuota")
    public String guardarCuotas(@ModelAttribute("cuota")Cuotas cuota){
        cuotasService.create(cuota);
        return "redirect:/cuotas";

    }

    @GetMapping("/documentacion/estudiante")
    public String crearCuotasFormulario(Model model){
        DocumentarArancelMastricula documentar = new DocumentarArancelMastricula();
        model.addAttribute("documentar",documentar);
        return "AdministracionDocumentacion";

    }

    @PostMapping("/documentacion")
    public String guardarCuotasDoc(@ModelAttribute("documentar") DocumentarArancelMastricula documentarArancelMastricula){
        cuotasService.crearCuotas(documentarArancelMastricula);
        return "redirect:/cuotas";

    }
}
