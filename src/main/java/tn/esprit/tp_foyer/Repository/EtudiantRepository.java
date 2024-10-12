package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Etudiant;
import tn.esprit.tp_foyer.entity.TypeChambre;

import java.util.List;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
  
}
