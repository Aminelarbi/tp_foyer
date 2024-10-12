package tn.esprit.tp_foyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp_foyer.Repository.UniversiteRepository;
import tn.esprit.tp_foyer.entity.Universite;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {
    UniversiteRepository universiteRepository;

    public List<Universite> retrieveAllUniversites() {
        return universiteRepository.findAll();
    }

    public Universite retrieveUniversite(Long idUniversite) {
        return universiteRepository.findById(idUniversite).get();
    }

    public Universite addUniversite(Universite c) {
        return universiteRepository.save(c);
    }

    public void removeUniversite(Long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    public Universite modifyUniversite(Universite foyer) {
        return universiteRepository.save(foyer);
    }
}