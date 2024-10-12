package tn.esprit.tp_foyer.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private long capaciteFoyer;

    private String nomFoyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> Blocs;

    @OneToOne(mappedBy= "foyer")

    private Universite universite;

    public Foyer(long idFoyer, long capaciteFoyer, String nomFoyer, Set<Bloc> Blocs, Universite universite) {
        this.idFoyer = idFoyer;
        this.capaciteFoyer = capaciteFoyer;
        this.nomFoyer = nomFoyer;
        this.Blocs = Blocs;
        this.universite = universite;
    }

    public Foyer() {
    }


    public Set<Bloc> getBlocs() {
        return this.Blocs;
    }

    public long getIdFoyer() {
        return this.idFoyer;
    }

    public long getCapaciteFoyer() {
        return this.capaciteFoyer;
    }

    public String getNomFoyer() {
        return this.nomFoyer;
    }

    public Universite getUniversite() {
        return this.universite;
    }

    public void setIdFoyer(long idFoyer) {
        this.idFoyer = idFoyer;
    }

    public void setCapaciteFoyer(long capaciteFoyer) {
        this.capaciteFoyer = capaciteFoyer;
    }

    public void setNomFoyer(String nomFoyer) {
        this.nomFoyer = nomFoyer;
    }

    public void setBlocs(Set<Bloc> Blocs) {
        this.Blocs = Blocs;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }
}
