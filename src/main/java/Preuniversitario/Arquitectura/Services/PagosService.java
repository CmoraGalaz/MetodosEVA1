package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Cuotas;
import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Models.Pagos;
import Preuniversitario.Arquitectura.Repositorys.ICuotasRepository;
import Preuniversitario.Arquitectura.Repositorys.IPagosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PagosService implements IPagosService<Pagos>{

    @Autowired
    private CuotasService iCuotasRepository;
    @Autowired
    private IPagosRepository iPagosRepository;
    @Override
    public List<Pagos> findAll() {
        return iPagosRepository.findAll();
    }

    @Override
    public  Pagos create(Pagos pagos) {

        return iPagosRepository.save(pagos);
    }

    public void pagarCuota(Pagos pagos){
        List<Cuotas> cuotas = iCuotasRepository.findAll();
        for (int i = 0 ; i < cuotas.size();i++){
            if(cuotas.get(i).getRut().equals(pagos.getRut())){
                Cuotas cuotas2 = new Cuotas();
                cuotas2.setIdCuota(cuotas.get(i).getIdCuota());
                cuotas2.setMonto(0);
                cuotas2.setRut(cuotas.get(i).getRut());
                cuotas2.setNumeroCuota(pagos.getNumCuota());
                cuotas2.setFechaVencimiento(cuotas.get(i).getFechaVencimiento());
                cuotas2.setDescripcion(cuotas.get(i).getDescripcion());
                cuotas2.setEstado("Pagado");
                cuotas2.setFechaPago(pagos.getFechaPago());
                iCuotasRepository.update(cuotas2);
                iPagosRepository.save(pagos);

            }

        }

    }
}
