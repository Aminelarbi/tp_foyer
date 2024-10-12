package tn.esprit.tp_foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp_foyer.entity.Bloc;

import java.util.List;

@Repository

public interface BlocRepository extends JpaRepository<Bloc, Long> {
    long count();
    List<Bloc> findAllByFoyerIsNull();

    //Bloc findBlocByCapaciter();

}
