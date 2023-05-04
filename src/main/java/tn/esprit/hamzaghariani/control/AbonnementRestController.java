package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Abonnement;
import tn.esprit.hamzaghariani.services.IAbonnementService;

import java.util.List;

@RestController
@RequestMapping("/abonnement")
public class AbonnementRestController {

    @Autowired
    IAbonnementService abonnementService;

    @GetMapping("/retrieve-all-abonnements")
    public List<Abonnement> getAbonnements() {
        List<Abonnement> listAbonnements = abonnementService.retrieveAllAbonnements();
        return listAbonnements;
    }

    @GetMapping("/retrieve-abonnement/{idAbonnement}")
    public Abonnement retrieveAbonnement(@PathVariable("idAbonnement") int idAbonnement) {
        Abonnement abonnement = abonnementService.retrieveAbonnement(idAbonnement);
        return abonnement;
    }

    @PostMapping("/add-abonnement")
    public Abonnement addAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement addedAbonnement = abonnementService.addAbonnement(abonnement);
        return addedAbonnement;
    }

    @DeleteMapping("/remove-abonnement/{idAbonnement}")
    public void removeAbonnement(@PathVariable("idAbonnement") int idAbonnement) {
        abonnementService.removeAbonnement(idAbonnement);
    }

    @PutMapping("/modify-abonnement")
    public Abonnement modifyAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement modifiedAbonnement = abonnementService.modifyAbonnement(abonnement);
        return modifiedAbonnement;
    }
}
