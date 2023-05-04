package tn.esprit.hamzaghariani.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.hamzaghariani.entities.Skieur;
import tn.esprit.hamzaghariani.services.ISkieurService;

import java.util.List;

@RestController
@RequestMapping("/skieur")
public class SkieurRestController {

    @Autowired
    ISkieurService skieurService;

    // http://localhost:8089/skieur/retrieve-all-skieurs
    @GetMapping("/retrieve-all-skieurs")
    public List<Skieur> getSkieurs() {
        List<Skieur> listSkieurs = skieurService.retrieveAllSkieurs();
        return listSkieurs;
    }

    // http://localhost:8089/skieur/retrieve-skieur/1
    @GetMapping("/retrieve-skieur/{skieur-id}")
    public Skieur retrieveSkieur(@PathVariable("skieur-id") int skieurId) {
        Skieur skieur = skieurService.retrieveSkieur(skieurId);
        return skieur;
    }

    // http://localhost:8089/skieur/add-skieur
    @PostMapping("/add-skieur")
    public Skieur addSkieur(@RequestBody Skieur skieur) {
        Skieur newSkieur = skieurService.addSkieur(skieur);
        return newSkieur;
    }

    // http://localhost:8089/skieur/remove-skieur/1
    @DeleteMapping("/remove-skieur/{skieur-id}")
    public void removeSkieur(@PathVariable("skieur-id") int skieurId) {
        skieurService.removeSkieur(skieurId);
    }

    // http://localhost:8089/skieur/modify-skieur
    @PutMapping("/modify-skieur")
    public Skieur modifySkieur(@RequestBody Skieur skieur) {
        Skieur modifiedSkieur = skieurService.modifySkieur(skieur);
        return modifiedSkieur;
    }

}

