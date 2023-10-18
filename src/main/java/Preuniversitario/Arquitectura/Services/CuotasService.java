package Preuniversitario.Arquitectura.Services;

import Preuniversitario.Arquitectura.Models.Cuotas;
import Preuniversitario.Arquitectura.Models.DocumentarArancelMastricula;
import Preuniversitario.Arquitectura.Models.Estudiantes;
import Preuniversitario.Arquitectura.Repositorys.ICuotasRepository;
import Preuniversitario.Arquitectura.Repositorys.IEstudiantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CuotasService implements ICuotasService<Cuotas> {

    @Autowired
    private IEstudiantesRepository iEstudiantesRepository;

    @Autowired
    private ICuotasRepository iCuotasRepository;

    @Override
    public List<Cuotas> findAll() {
        return iCuotasRepository.findAll();
    }

    @Override
    public Cuotas create(Cuotas cuotas) {
        return iCuotasRepository.save(cuotas);
    }

    @Override
    public Cuotas update(Cuotas cuotas) {
        return iCuotasRepository.save(cuotas);
    }

    public DocumentarArancelMastricula crearCuotas(DocumentarArancelMastricula documentarArancelMastricula) {
        int w = 1;
        double arancel = 1500000;
        List<Estudiantes> estudiantes = iEstudiantesRepository.findAll();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getRut().equals(documentarArancelMastricula.getRut())) {
                if ((estudiantes.get(i).getTipoColegio().equals("Municipal")) && (documentarArancelMastricula.getCuotasSeleccionadas() <= 10)) {
                    arancel = arancel - (arancel * 0.20);
                    if ((documentarArancelMastricula.getEgreso() - 2023) <= 1) {
                        arancel = arancel - (arancel * 0.15);

                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;
                        }

                    }
                    if ((documentarArancelMastricula.getEgreso() - 2023) == 2) {
                        arancel = arancel - (arancel * 0.08);
                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;
                        }

                    }
                    if (((documentarArancelMastricula.getEgreso() - 2023) > 2) && ((documentarArancelMastricula.getEgreso() - 2023) <= 4)) {
                        arancel = arancel - (arancel * 0.04);
                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;

                        }


                        if ((documentarArancelMastricula.getEgreso() - 2023) >= 5) {
                            for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                                String fechaPago = "01/" + "0" + w + "/2024";
                                String fechaVencimiento = "06/" + "0" + w + "/2024";

                                Cuotas cuota = new Cuotas();
                                cuota.setNumeroCuota(w);
                                cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                                cuota.setRut(documentarArancelMastricula.getRut());
                                cuota.setEstado("Pendiente");
                                cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                                cuota.setFechaPago(fechaPago);
                                cuota.setFechaVencimiento(fechaVencimiento);
                                iCuotasRepository.save(cuota);
                                w++;


                            }


                        }
                    }

                }if ((estudiantes.get(i).getTipoColegio().equals("Subvencionado") )&& (documentarArancelMastricula.getCuotasSeleccionadas() <= 7)) {
                    arancel = arancel - (arancel * 0.10); // genero el descuento por tipo de colegio
                        if ((documentarArancelMastricula.getEgreso() - 2023) <= 1) {
                            arancel = arancel - (arancel * 0.15);

                            for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                                String fechaPago = "01/" + "0" + w + "/2024";
                                String fechaVencimiento = "06/" + "0" + w + "/2024";

                                Cuotas cuota = new Cuotas();
                                cuota.setNumeroCuota(w);
                                cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                                cuota.setRut(documentarArancelMastricula.getRut());
                                cuota.setEstado("Pendiente");
                                cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                                cuota.setFechaPago(fechaPago);
                                cuota.setFechaVencimiento(fechaVencimiento);


                                iCuotasRepository.save(cuota);
                                w++;
                            }

                        }
                        if ((documentarArancelMastricula.getEgreso() - 2023) == 2) {
                            arancel = arancel - (arancel * 0.08);
                            for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                                String fechaPago = "01/" + "0" + w + "/2024";
                                String fechaVencimiento = "06/" + "0" + w + "/2024";

                                Cuotas cuota = new Cuotas();
                                cuota.setNumeroCuota(w);
                                cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                                cuota.setRut(documentarArancelMastricula.getRut());
                                cuota.setEstado("Pendiente");
                                cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                                cuota.setFechaPago(fechaPago);
                                cuota.setFechaVencimiento(fechaVencimiento);


                                iCuotasRepository.save(cuota);
                                w++;
                            }

                        }
                        if (((documentarArancelMastricula.getEgreso() - 2023) > 2) && ((documentarArancelMastricula.getEgreso() - 2023) <= 4)) {
                            arancel = arancel - (arancel * 0.04);
                            for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                                String fechaPago = "01/" + "0" + w + "/2024";
                                String fechaVencimiento = "06/" + "0" + w + "/2024";

                                Cuotas cuota = new Cuotas();
                                cuota.setNumeroCuota(w);
                                cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                                cuota.setRut(documentarArancelMastricula.getRut());
                                cuota.setEstado("Pendiente");
                                cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                                cuota.setFechaPago(fechaPago);
                                cuota.setFechaVencimiento(fechaVencimiento);


                                iCuotasRepository.save(cuota);
                                w++;

                            }



                        }
                        if ((documentarArancelMastricula.getEgreso() - 2023) >= 5) {
                            for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                                String fechaPago = "01/" + "0" + w + "/2024";
                                String fechaVencimiento = "06/" + "0" + w + "/2024";

                                Cuotas cuota = new Cuotas();
                                cuota.setNumeroCuota(w);
                                cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                                cuota.setRut(documentarArancelMastricula.getRut());
                                cuota.setEstado("Pendiente");
                                cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                                cuota.setFechaPago(fechaPago);
                                cuota.setFechaVencimiento(fechaVencimiento);
                                iCuotasRepository.save(cuota);
                                w++;


                            }


                        }



                    }if (estudiantes.get(i).getTipoColegio().equals("Privado") && (documentarArancelMastricula.getCuotasSeleccionadas() <= 4)){
                    arancel = 1500000;
                    if ((documentarArancelMastricula.getEgreso() - 2023) <= 1) {
                        arancel = arancel - (arancel * 0.15);

                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;
                        }

                    }
                    if ((documentarArancelMastricula.getEgreso() - 2023) == 2) {
                        arancel = arancel - (arancel * 0.08);
                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;
                        }

                    }
                    if (((documentarArancelMastricula.getEgreso() - 2023) > 2) && ((documentarArancelMastricula.getEgreso() - 2023) <= 4)) {
                        arancel = arancel - (arancel * 0.04);
                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);


                            iCuotasRepository.save(cuota);
                            w++;

                        }



                    }
                    if ((documentarArancelMastricula.getEgreso() - 2023) >= 5) {
                        for (int a = 0; a < documentarArancelMastricula.getCuotasSeleccionadas(); a++) {

                            String fechaPago = "01/" + "0" + w + "/2024";
                            String fechaVencimiento = "06/" + "0" + w + "/2024";

                            Cuotas cuota = new Cuotas();
                            cuota.setNumeroCuota(w);
                            cuota.setDescripcion(documentarArancelMastricula.getTipoDocumentacion());
                            cuota.setRut(documentarArancelMastricula.getRut());
                            cuota.setEstado("Pendiente");
                            cuota.setMonto((int) (arancel / documentarArancelMastricula.getCuotasSeleccionadas()));
                            cuota.setFechaPago(fechaPago);
                            cuota.setFechaVencimiento(fechaVencimiento);
                            iCuotasRepository.save(cuota);
                            w++;


                        }


                    }
                }






            }




        }


        return documentarArancelMastricula;
    }
}


