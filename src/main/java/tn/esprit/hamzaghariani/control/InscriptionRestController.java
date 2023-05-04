package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Inscription;
import tn.esprit.hamzaghariani.services.IInscriptionService;

import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionRestController {
    @Autowired
    IInscriptionService inscriptionService;
    // http://localhost:8089/ski/inscription/retrieve-all-inscriptions
    @GetMapping("/retrieve-all-inscriptions")
    public List<Inscription> getInscriptions() {
        List<Inscription> listInscriptions = inscriptionService.retrieveAllInscriptions();
        return listInscriptions;
    }
    // http://localhost:8089/ski/inscription/retrieve-inscription/8
    @GetMapping("/retrieve-inscription/{inscription-id}")
    public Inscription retrieveInscription(@PathVariable("inscription-id") int inscriptionId) {
        Inscription inscription = inscriptionService.retrieveInscription(inscriptionId);
        return inscription;
    }
    // http://localhost:8089/ski/inscription/add-inscription
    @PostMapping("/add-inscription")
    public Inscription addInscription(@RequestBody Inscription i) {
        Inscription inscription = inscriptionService.addInscription(i);
        return inscription;
    }
    // http://localhost:8089/ski/inscription/remove-inscription/{inscription-id}
    @DeleteMapping("/remove-inscription/{inscription-id}")
    public void removeInscription(@PathVariable("inscription-id") int inscriptionId) {
        inscriptionService.removeInscription(inscriptionId);
    }
    // http://localhost:8089/ski/inscription/modify-inscription
    @PutMapping("/modify-inscription")
    public Inscription modifyInscription(@RequestBody Inscription i) {
        Inscription inscription = inscriptionService.modifyInscription(i);
        return inscription;
    }
}
