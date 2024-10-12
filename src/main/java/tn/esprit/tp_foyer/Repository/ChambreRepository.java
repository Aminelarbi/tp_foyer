package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.entity.TypeChambre;

import java.util.List;
@Repository
public interface ChambreRepository  extends JpaRepository<Chambre, Long>
{

    List<Chambre> findAllByNumeroChambreIsNull();
    List<Chambre> findAllByTypceC(TypeChambre tc);
    Chambre findChambreByNumeroChambre(long numC);
    long count();

}
