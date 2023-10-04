package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.MetodosDePago;
import Preuniversitario.Arquitectura.Repositorys.IMetodosDePagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetodosDePagoService implements IMetodosDePagoService<MetodosDePago> {
    @Autowired
    private IMetodosDePagoRepository iMetodosDePagoRepository;


    @Override
    public List<MetodosDePago> findAll() {
        return iMetodosDePagoRepository.findAll();
    }

    @Override
    public MetodosDePago create(MetodosDePago metodosDePago) {
        return iMetodosDePagoRepository.save(metodosDePago);
    }
}
