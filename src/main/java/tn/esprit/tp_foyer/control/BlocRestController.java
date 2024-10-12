package tn.esprit.tp_foyer.control;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp_foyer.entity.Bloc;
import tn.esprit.tp_foyer.service.IBlocService;

import java.util.List;

@Tag(name = "Gestion Bloc")
@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    IBlocService blocService;

    @Operation(description = "récupérer toutes les blocs de la base de données")
    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        List<Bloc> listBlocs = blocService.retrieveAllBlocs();
        return listBlocs;
    }

    // http://localhost:8089/tpfoyer/bloc/retrieve-bloc/8
    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long chId) {
        Bloc bloc = blocService.retrieveBloc(chId);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/add-bloc
    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.addBloc(c);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}
    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long chId) {
        blocService.removeBloc(chId);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc
    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc c) {
        Bloc bloc = blocService.modifyBloc(c);
        return bloc;
    }
    // http://localhost:8089/Tp8/tpfoyer/ajouter-bloc-et-projet-foyer
    @PostMapping("/ajouter-projet-et-projet-detail")
    public Bloc addblocAndfoyer(@RequestBody Bloc b) {
        Bloc bloc = blocService.addblocAndfoyer(b);
        return bloc;
    }

    @PutMapping("/affecter-bloc-a-foyer/{bloc-id}/{foyer-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("bloc-id") Long idBlock,
                                             @PathVariable("foyer-id") Long idFoyer) {
        blocService.assignblocTofoyer(idBlock, idFoyer);
    }
    @PutMapping("/desaffecter-foyer/{bloc-id}")
    public void DesaffecterProjetDetailFromProjet(@PathVariable("bloc-id") Long idBlock) {
        blocService.DesaffecterblocFromFoyer(idBlock);
    }

    @GetMapping("/retrieve-all-blocs sans foyer")
    public List<Bloc> getBlocssansfoyer() {
        List<Bloc> listBlocs = blocService.trouvertouslesblocs();
        return listBlocs;
    }
}
