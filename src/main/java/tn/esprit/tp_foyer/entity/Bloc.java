package tn.esprit.tp_foyer.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Bloc {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private long idBlock;
    private long capaciteBloc;

    private String nomBloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    @ToString.Exclude
    private Set<Chambre> Chambres;


//@JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    Foyer foyer;

}
