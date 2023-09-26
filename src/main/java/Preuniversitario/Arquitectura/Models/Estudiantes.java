package Preuniversitario.Arquitectura.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Estudiantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
/*
Estudiante : Cumple el rol de plantilla para instanciar un objeto recibiendo los datos de la base de datos.

*/
public class Estudiantes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RUT")
    private Integer rut;

    @Column(name = "NOMBRES")
    private String nombres;

    @Column(name = "APELLIDOS")
    private String apellidos;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "TIPO_COLEGIO")
    private String tipoColegio;

    @Column(name = "NOMBRE_COLEGIO")
    private String nombreColegio;

    @Column(name = "EGRESO")
    private Integer egreso;
}
