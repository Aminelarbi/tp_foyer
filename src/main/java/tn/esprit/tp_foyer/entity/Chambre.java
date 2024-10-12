package tn.esprit.tp_foyer.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
     long idChambre;
     long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typceC;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

    @ManyToOne
    Bloc bloc;
}
