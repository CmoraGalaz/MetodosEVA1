package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Entity
@Table(name = "pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpago")
    private Integer idPago;
    @Column(name = "fecha_pago")
    private String fechaPago;
    @Column(name = "montopago")
    private Integer montoPago;
    @Column(name = "rut")
    private Integer rut;
    @Column(name = "numcuota")
    private Integer numCuota;


}
