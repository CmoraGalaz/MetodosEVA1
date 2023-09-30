package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "examenes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Examenes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_examen")
    private Integer idExamen;
@Column(name = "nom_exam")
    private String nomExam;
@Column(name = "descripcion")
    private String descripcion;
@Column(name = "puntaje")
    private Integer puntaje;
}
