package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "metodosdepagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MetodosDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_metodosdepago")
    private Integer idMetodosDePagos;
    @Column (name = "nom_metodo")
    private String nomMetodo;
    @Column (name = "cuotas_pac")
    private Integer cuotasPactadas;
    @Column (name = "cuotas_vig")
    private Integer cuotasVig;
    @Column (name = "estado")
    private String estado;
}
