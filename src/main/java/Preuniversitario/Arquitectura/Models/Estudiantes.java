package Preuniversitario.Arquitectura.Models;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "estudiantes")
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
    @Column(name = "rut")
    private Integer rut;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "tipo_colegio")
    private String tipoColegio;

    @Column(name = "nombre_colegio")
    private String nombreColegio;

    @Column(name = "egreso")
    private Integer egreso;
}
