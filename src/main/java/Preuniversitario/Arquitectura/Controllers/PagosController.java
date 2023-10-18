package Preuniversitario.Arquitectura.Controllers;

import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Models.Pagos;
import Preuniversitario.Arquitectura.Services.PagosService;
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
public class PagosController {
    @Autowired
    private PagosService pagosService;


    @GetMapping("/pagos")
    public String mostrar (Model model){
        ArrayList<Pagos> pagos = (ArrayList<Pagos>) pagosService.findAll();
        model.addAttribute("pagos",pagos);
        return "ListarPagos";

    }



    @GetMapping("/pago/nuevo")
    public String crearPagoFormulario(Model model){
       Pagos pago = new Pagos();
        model.addAttribute("pago",pago);
        return "AdministracionPagos";

    }

    @PostMapping("/pago")
    public String guardarPago(@ModelAttribute("pago")Pagos pago){
        pagosService.pagarCuota(pago);
        return "redirect:/pagos";

    }
}
