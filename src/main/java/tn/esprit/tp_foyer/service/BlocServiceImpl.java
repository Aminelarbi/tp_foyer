package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.Repository.BlocRepository;
import tn.esprit.tp_foyer.Repository.FoyerRepository;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.entity.Chambre;
import tn.esprit.tp_foyer.entity.Foyer;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BlocServiceImpl implements IBlocService {
    BlocRepository blocRepository;
FoyerRepository foyerRepository;
    @Scheduled(fixedDelay = 10000) // 10000 millisecondes
    public List<Bloc> retrieveAllBlocs() {

        List<Bloc> listB = blocRepository.findAll();
        for (Bloc b: listB) {
            log.info("Bloc :" + b);
        }
        return listB;
    }

    public Bloc retrieveBloc(Long idBlock) {

        return blocRepository.findById(idBlock).get();
    }

    public Bloc addBloc(Bloc c) {
        return blocRepository.save(c);
    }

    public void removeBloc(Long idBlock) {
        blocRepository.deleteById(idBlock);
    }

    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public Bloc addblocAndfoyer(Bloc b){
        return blocRepository.save(b);
    }

    public void assignblocTofoyer(Long idBlock, Long idFoyer) {
        Bloc bloc = blocRepository.findById(idBlock).get();
        Foyer foyer = foyerRepository.findById(idFoyer).get();
        bloc.setFoyer(foyer);
        blocRepository.save(bloc);
    }

    public Bloc DesaffecterblocFromFoyer(Long idBlock) {
        Bloc bloc = blocRepository.findById(idBlock).get();
        bloc.setFoyer(null);
        return blocRepository.save(bloc);
    }
public  List<Bloc>trouvertouslesblocs(){
    List<Bloc> listB = blocRepository.findAllByFoyerIsNull();
    for (Bloc b: listB) {
        log.info("Bloc sans foyer:" + b);
    }
    return listB;
}

}