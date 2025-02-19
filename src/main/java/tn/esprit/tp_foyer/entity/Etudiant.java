package tn.esprit.tp_foyer.entity;
// first test 
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private long cin;

    private String nomEt;
    private String prenomEt;
    private String ecole;

    private Date dateNaissance;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
