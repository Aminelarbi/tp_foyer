package tn.esprit.tp_foyer.service;

import tn.esprit.tp_foyer.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversites();
    public Universite retrieveUniversite(Long idUniversite);
    public Universite addUniversite(Universite c);
    public void removeUniversite(Long idUniversite);
    public Universite modifyUniversite(Universite foyer);

}
