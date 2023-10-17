package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cuotas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cuotas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcuota")
    private Integer idCuota;
    @Column(name = "monto")
    private Integer monto;
    @Column(name = "fechavencimiento")
    private String fechaVencimiento;
    @Column(name = "fechapago")
    private String fechaPago;
    @Column(name = "estado")
    private String estado;
    @Column(name = "rut")
    private Integer rut;
    @Column(name = "numerocuota")
    private Integer numeroCuota;
    @Column(name = "descripcion")
    private String descripcion;


}
