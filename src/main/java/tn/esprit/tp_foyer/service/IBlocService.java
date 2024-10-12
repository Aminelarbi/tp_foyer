package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();
    public Bloc retrieveBloc(Long idBlock);
    public Bloc addBloc(Bloc c);
    public void removeBloc(Long idBlock);
    public Bloc modifyBloc(Bloc bloc);
    public Bloc addblocAndfoyer(Bloc b);

    public void assignblocTofoyer(Long idBlock, Long idFoyer);
    public Bloc DesaffecterblocFromFoyer(Long idBlock);
    public  List<Bloc>trouvertouslesblocs();
}
