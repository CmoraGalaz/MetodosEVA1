package Preuniversitario.Arquitectura.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "aranceles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Aranceles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_arancel")
    private Integer idArancel;
    @Column (name = "nom_arancel")
    private String nomArancel;
    @Column (name = "valor")
    private Integer valor;

}
