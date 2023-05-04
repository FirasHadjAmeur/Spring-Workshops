package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Moniteur;
import tn.esprit.hamzaghariani.services.IMoniteurService;

import java.util.List;

@RestController
@RequestMapping("/moniteur")
public class MoniteurRestController {
    @Autowired
    IMoniteurService moniteurService;

    // http://localhost:8089/ski/moniteur/retrieve-all-moniteurs
    @GetMapping("/retrieve-all-moniteurs")
    public List<Moniteur> getMoniteurs() {
        List<Moniteur> listMoniteurs = moniteurService.retrieveAllMoniteurs();
        return listMoniteurs;
    }

    // http://localhost:8089/ski/moniteur/retrieve-moniteur/1
    @GetMapping("/retrieve-moniteur/{moniteur-id}")
    public Moniteur retrieveMoniteur(@PathVariable("moniteur-id") int moniteurId) {
        Moniteur moniteur = moniteurService.retrieveMoniteur(moniteurId);
        return moniteur;
    }

    // http://localhost:8089/ski/moniteur/add-moniteur
    @PostMapping("/add-moniteur")
    public Moniteur addMoniteur(@RequestBody Moniteur m) {
        Moniteur moniteur = moniteurService.addMoniteur(m);
        return moniteur;
    }

    // http://localhost:8089/ski/moniteur/remove-moniteur/1
    @DeleteMapping("/remove-moniteur/{moniteur-id}")
    public void removeMoniteur(@PathVariable("moniteur-id") int moniteurId) {
        moniteurService.removeMoniteur(moniteurId);
    }

    // http://localhost:8089/ski/moniteur/modify-moniteur
    @PutMapping("/modify-moniteur")
    public Moniteur modifyMoniteur(@RequestBody Moniteur moniteur) {
        Moniteur updatedMoniteur = moniteurService.modifyMoniteur(moniteur);
        return updatedMoniteur;
    }
}
