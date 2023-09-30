package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "estudiantes_examenes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EstudiantesExamenes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante_examen")
    private Integer idEstudianteExamen;
    @Column (name = "puntaje_obtenido")
    private Integer puntajeObtenido;
    @Column (name = "fecha_realizada")
    private Date fechaRealizada;
    @Column (name = "rut")
    private String rut;
    @Column (name = "id_examen")
    private Integer idExamen;
}
